دكتور بوس - مشروع Android

مهم:
- هذا ملف مصدر مشروع Android، وليس APK جاهزاً.
- لم يتم بناء المشروع أو اختباره في هذه البيئة.
- عند رفعه إلى GitHub وتشغيل Actions بنجاح، سيظهر ملف APK للتنزيل.
- لا ترفع أسماء مراجعين أو أرقام هواتف أو نسخ احتياطية حقيقية إلى GitHub.

طريقة الرفع:
1) فك ضغط Doctor_Boss_Android_Project.zip على الهاتف.
2) افتح مستودع DoctorBoss في GitHub.
3) من Code اختر Add file ثم Upload files.
4) ارفع محتويات مجلد Doctor_Boss_Android (كل الملفات والمجلدات بداخله) إلى جذر المستودع.
5) تأكد من رفع المجلد المخفي .github وبداخله workflows/build-apk.yml.
6) اضغط Commit changes.
7) افتح تبويب Actions وشاهد عملية Build Doctor Boss APK.
8) عند نجاحها، افتح العملية الناجحة ونزّل Artifact باسم Doctor-Boss-APK.
9) فك ضغط ملف Artifact وثبّت app-debug.apk.

المتطلبات:
Android Studio / Gradle 8.9 / JDK 17 للبناء المحلي.
GitHub Actions يبني المشروع سحابياً دون الحاجة إلى كمبيوتر المستخدم.
