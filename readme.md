# 📚 LexisNode - Ứng dụng Học Từ Vựng Chuyên Sâu

Chào mừng team đến với dự án **LexisNode**! Đây là ứng dụng học từ vựng tiếng Anh tập trung vào các từ vựng học thuật (IELTS/CEFR C1-C2).

Hiện tại, ứng dụng đã hoàn thành giai đoạn **Prototype (Mô hình giao diện cơ bản)**. Giao diện (UI) đã được dựng bằng Jetpack Compose, nhưng phần dữ liệu và kiến trúc bên dưới vẫn dùng dữ liệu giả (Mock Data) và chưa hoàn thiện.

Tài liệu này liệt kê các phần còn thiếu và phân công công việc cụ thể cho 6 thành viên trong team để biến Prototype này thành một ứng dụng hoàn chỉnh có thể đưa lên store.

---

## 🛠 Tình trạng dự án hiện tại (Current Status)

- **UI Framework:** Đã dựng 100% bằng Jetpack Compose.
- **Màn hình hiện có:** `HomeScreen` (Trang chủ) và `WordDetailScreen` (Chi tiết từ vựng).
- **Dữ liệu:** Đang sử dụng danh sách tĩnh (`WordRepository.vocabularyList`).
- **Luồng điều hướng:** Đang sử dụng `Crossfade` và biến State thủ công (Chưa dùng Navigation Compose).

---

## 🚀 Những phần còn thiếu & Cần hoàn thiện (TODOs)

Dự án cần được bổ sung các module quan trọng sau:

### 1. Kiến trúc & Core (Architecture)
- [ ] Chuyển đổi cơ chế điều hướng sang **Jetpack Navigation Compose**.
- [ ] Áp dụng kiến trúc **MVVM** (Tách logic khỏi `@Composable` đưa vào các `ViewModel`).
- [ ] Tích hợp **Dependency Injection** (Hilt hoặc Dagger).

### 2. Dữ liệu (Data Layer)
- [ ] Tích hợp **Room Database** để lưu trữ từ vựng offline, lịch sử tra cứu và danh sách từ yêu thích.
- [ ] Xây dựng **Backend / API kết nối** (Retrofit) hoặc **Firebase** để tải dữ liệu từ vựng mới mà không cần update app.

### 3. Tính năng (Features)
- [ ] **Phát âm (Audio/TTS):** Cài đặt Android Text-To-Speech hoặc ExoPlayer cho nút "Nghe" ở màn hình chi tiết từ.
- [ ] **Lưu từ vựng (Bookmark):** Xử lý logic nút thả tim, lưu từ vào Database và tạo màn hình "Từ vựng của tôi".
- [ ] **Tìm kiếm tối ưu:** Nâng cấp thanh tìm kiếm với kỹ thuật Debounce và query trực tiếp từ Database (hiện tại đang filter từ list tĩnh gây giật lag nếu data lớn).
- [ ] **Tính năng học/Ôn tập:** Thêm màn hình Flashcard hoặc Quiz để ôn lại các từ đã lưu.

### 4. Giao diện & Trải nghiệm (UI/UX)
- [ ] Thiết kế **App Icon** và **Splash Screen** (Màn hình chờ).
- [ ] Xử lý các trạng thái: Loading (Đang tải), Error (Lỗi mạng), Empty (Không có dữ liệu).

---

## 👥 Phân công công việc (Team 6 Người)

Để tránh xung đột code (conflict) khi merge, chúng ta sẽ chia việc theo từng domain cụ thể:

### 🧑‍💻 1. Thành viên 1: Team Lead & Core Architecture
- **Nghĩa vụ:** Thiết lập bộ khung dự án.
- **Tasks:**
    - Setup Navigation Compose, thay thế toàn bộ `Crossfade` hiện tại.
    - Setup Hilt (Dependency Injection).
    - Tạo cấu trúc thư mục chuẩn (di/ ui/ data/ domain/...).
    - Review Pull Requests của các thành viên khác.

### 🧑‍💻 2. Thành viên 2: Data & Database Engineer
- **Nghĩa vụ:** Quản lý kho dữ liệu cục bộ và API.
- **Tasks:**
    - Setup Room Database, định nghĩa các Entities (`WordEntity`, `BookmarkEntity`).
    - Viết DAO và Repositories để cung cấp data cho các ViewModels.
    - (Tùy chọn) Setup Firebase Firestore hoặc Retrofit để sync data từ xa.

### 🧑‍💻 3. Thành viên 3: Feature Dev (Home & Search)
- **Nghĩa vụ:** Hoàn thiện luồng trang chủ và tìm kiếm.
- **Tasks:**
    - Viết `HomeViewModel` để quản lý logic "Word of the Day" và danh sách tìm kiếm.
    - Tối ưu hóa thanh tìm kiếm (Debounce Search).
    - Hoàn thiện UI/UX màn hình Profile (Hồ sơ người dùng).

### 🧑‍💻 4. Thành viên 4: Feature Dev (Word Detail & Audio)
- **Nghĩa vụ:** Hoàn thiện luồng chi tiết từ vựng và xử lý Media.
- **Tasks:**
    - Gắn `DetailViewModel` vào `WordDetailScreen`.
    - Nghiên cứu và code tính năng Phát âm (Text-To-Speech).
    - Xử lý logic bấm nút "Thả tim" (gọi hàm lưu xuống DB từ Repository).

### 🧑‍💻 5. Thành viên 5: Feature Dev (Flashcard & Quiz)
- **Nghĩa vụ:** Xây dựng tính năng mới giúp giữ chân người dùng.
- **Tasks:**
    - Tạo riêng một nhánh (branch) mới để phát triển tính năng "Ôn tập".
    - Code UI vuốt Flashcard để học lại các từ trong danh sách Bookmark.
    - Viết logic xáo trộn từ vựng và chấm điểm tiến độ học.

### 🧑‍💻 6. Thành viên 6: QA, Content & Release
- **Nghĩa vụ:** Đảm bảo dữ liệu chuẩn xác, kiểm thử và chuẩn bị phát hành.
- **Tasks:**
    - Chuẩn bị bộ dữ liệu thật (File JSON chứa ~500 từ vựng format chuẩn).
    - Cắt ghép hình ảnh App Icon, Splash Screen đưa vào thư mục `res`.
    - Viết Unit Test cơ bản. Khám phá các lỗi hiển thị (đặc biệt khi text quá dài hoặc ở Dark Mode).
    - Phụ trách cấu hình file `.apk` và `.aab` (Release build).

---

## 📌 Hướng dẫn làm việc với Git

- **Pull Code:** Luôn pull code mới nhất từ nhánh `main` (hoặc `develop`) trước khi bắt đầu code.
- **Tạo Branch:** Mọi người tạo branch theo cấu trúc: `feature/<tên-tính-năng>`. Ví dụ: `feature/room-database` hoặc `feature/tts-setup`.
- **Commit:** Ghi chú commit rõ ràng, ví dụ: `feat: Add Room database for offline mode`, `fix: Fix search crash`.
- **Merge:** Bắt buộc tạo Pull Request (PR) và chờ Lead review, không được push thẳng lên nhánh chính.

Chúc team hoàn thành xuất sắc dự án LexisNode! 🚀
