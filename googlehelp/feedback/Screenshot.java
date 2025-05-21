package com.google.android.gms.googlehelp.feedback;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import defpackage.asej;
import defpackage.asot;
import defpackage.bivl;
import defpackage.bivm;
import defpackage.bivn;
import defpackage.bivo;
import defpackage.bqux;
import defpackage.ejhf;
import defpackage.fmut;
import defpackage.fnnl;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class Screenshot implements Parcelable, ReflectedParcelable {
    public int b;
    public int c;
    public String d;
    public static final asot a = asot.b("gH_Screenshot", asej.GOOGLE_HELP);
    public static final Parcelable.Creator CREATOR = new bivn();

    public static AsyncTask a(File file, String str, Screenshot screenshot, boolean z, bivo bivoVar) {
        File file2 = fmut.j() ? new File(bqux.a.b(file, "reports")) : new File(file, "reports");
        File file3 = fmut.j() ? new File(bqux.a.b(file2, String.valueOf(str).concat(".bmp"))) : new File(file2, String.valueOf(str).concat(".bmp"));
        if (file3.exists() && file3.canRead() && file3.canWrite()) {
            return new bivm(file3, z, file, str, screenshot, bivoVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
        return null;
    }

    public static Screenshot b(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            ((ejhf) a.i()).x("Screenshot is either null or recycled");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, (int) fnnl.b(), byteArrayOutputStream);
        return d(byteArrayOutputStream.toByteArray(), bitmap.getWidth(), bitmap.getHeight());
    }

    public static Screenshot c(String str, int i, int i2) {
        Screenshot screenshot = new Screenshot();
        screenshot.b = i;
        screenshot.c = i2;
        screenshot.d = str;
        return screenshot;
    }

    public static Screenshot d(byte[] bArr, int i, int i2) {
        return c(Base64.encodeToString(bArr, 0), i, i2);
    }

    public static void e(ErrorReport errorReport, Screenshot screenshot) {
        errorReport.v = null;
        if (screenshot == null || TextUtils.isEmpty(screenshot.d)) {
            errorReport.w = 0;
            errorReport.x = 0;
            errorReport.u = null;
        } else {
            errorReport.w = screenshot.c;
            errorReport.x = screenshot.b;
            errorReport.u = screenshot.d;
        }
    }

    public static Bitmap f(byte[] bArr, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        int length = bArr.length;
        BitmapFactory.decodeByteArray(bArr, 0, length, options);
        int i2 = options.outWidth / 2;
        int i3 = options.outHeight / 2;
        if (z) {
            int i4 = options.outHeight;
            int i5 = options.outWidth;
            if (i4 > i3 || i5 > i2) {
                i = Math.max(Math.round(i4 / i3), Math.round(i5 / i2));
            }
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, 0, length, options);
    }

    public static String g(File file, Bitmap bitmap) {
        File file2 = fmut.j() ? new File(bqux.a.b(file, "reports")) : new File(file, "reports");
        if (!file2.exists() && !file2.mkdirs()) {
            ((ejhf) a.i()).x("failed to create reports directory");
            return null;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            ((ejhf) a.i()).x("Cannot save. Bitmap is null or recycled.");
            return null;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        File file3 = fmut.j() ? new File(bqux.a.b(file2, String.valueOf(valueOf).concat(".bmp"))) : new File(file2, String.valueOf(valueOf).concat(".bmp"));
        for (File file4 : file2.listFiles()) {
            if (file4.getName().endsWith(".bmp") && !file4.getName().equals(file3.getName())) {
                file4.delete();
            }
            if (file4.getName().equals(file3.getName())) {
                return valueOf;
            }
        }
        try {
            new bivl(file3, bitmap).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]).get(fnnl.a.a().o(), TimeUnit.MILLISECONDS);
            return valueOf;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
