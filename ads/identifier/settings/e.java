package com.google.android.gms.ads.identifier.settings;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asnh;
import defpackage.bqux;
import defpackage.bquz;
import defpackage.dxax;
import defpackage.dxbg;
import defpackage.dxby;
import defpackage.dxca;
import defpackage.dxci;
import defpackage.dxew;
import defpackage.dxff;
import defpackage.dxfr;
import defpackage.dxfs;
import defpackage.dxft;
import defpackage.eite;
import defpackage.eitj;
import defpackage.ejtr;
import defpackage.ensh;
import defpackage.fjzz;
import defpackage.fmut;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class e {
    private static dxbg a;

    public static byte[] a(PackageInfo packageInfo, String str) {
        try {
            if (!fjzz.a.a().D()) {
                File file = fmut.i() ? new File(bqux.a.a(packageInfo.applicationInfo.sourceDir)) : new File(packageInfo.applicationInfo.sourceDir);
                byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
                MessageDigest e = asnh.e("SHA-256");
                if (e == null) {
                    Log.d("ApkHashUtils", String.format("Hashing algorithm cannot be found", new Object[0]));
                    return null;
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    for (int read = fileInputStream.read(bArr); read != -1; read = fileInputStream.read(bArr)) {
                        e.update(bArr, 0, read);
                    }
                    fileInputStream.close();
                    return e.digest();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
            int i = eitj.d;
            eite eiteVar = new eite();
            path.path(packageInfo.applicationInfo.sourceDir);
            Uri a2 = dxfs.a(dxby.a(path, eiteVar), dxft.b);
            dxbg b = b();
            dxci dxciVar = new dxci(a2);
            dxew dxewVar = new dxew();
            dxewVar.b = new dxax[]{dxciVar};
            InputStream inputStream = (InputStream) b.d(a2, dxewVar);
            try {
                ejtr.i(inputStream);
                String g = dxfr.g((Uri) ensh.b(dxciVar.a, IOException.class));
                if (g == null) {
                    Log.d("ApkHashUtils", "Digest cannot be found in computed uri");
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return null;
                }
                byte[] decode = Base64.decode(g, 2);
                if (inputStream != null) {
                    inputStream.close();
                }
                return decode;
            } catch (Throwable th3) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException unused) {
            Log.w("HashAPK", String.format("Failed to hash package %s", str));
            return null;
        } catch (NoSuchAlgorithmException e2) {
            Log.w("HashAPK", String.format("NoSuchAlgorithmException %s", e2));
            return null;
        }
    }

    private static synchronized dxbg b() {
        dxbg dxbgVar;
        synchronized (e.class) {
            if (a == null) {
                dxff[] dxffVarArr = new dxff[1];
                dxffVarArr[0] = fmut.f() ? new bquz(new dxca()) : new dxca();
                a = new dxbg(Arrays.asList(dxffVarArr), Arrays.asList(new dxfr()));
            }
            dxbgVar = a;
        }
        return dxbgVar;
    }
}
