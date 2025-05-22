package com.google.android.gms.ads.identifier.settings;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aurb;
import defpackage.btco;
import defpackage.btcq;
import defpackage.dzmx;
import defpackage.dzng;
import defpackage.dzny;
import defpackage.dzoa;
import defpackage.dzoi;
import defpackage.dzqw;
import defpackage.dzrf;
import defpackage.dzrr;
import defpackage.dzrs;
import defpackage.dzrt;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.emha;
import defpackage.eqga;
import defpackage.fmqe;
import defpackage.fpmr;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e {
    private static dzng a;

    public static byte[] a(PackageInfo packageInfo, String str) {
        try {
            if (!fmqe.a.lK().D()) {
                File file = fpmr.i() ? new File(btco.a.a(packageInfo.applicationInfo.sourceDir)) : new File(packageInfo.applicationInfo.sourceDir);
                byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
                MessageDigest e = aurb.e("SHA-256");
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
            int i = elgo.d;
            elgj elgjVar = new elgj();
            path.path(packageInfo.applicationInfo.sourceDir);
            Uri a2 = dzrs.a(dzny.a(path, elgjVar), dzrt.b);
            dzng b = b();
            dzoi dzoiVar = new dzoi(a2);
            dzqw dzqwVar = new dzqw();
            dzqwVar.b = new dzmx[]{dzoiVar};
            InputStream inputStream = (InputStream) b.d(a2, dzqwVar);
            try {
                emha.i(inputStream);
                String g = dzrr.g((Uri) eqga.b(dzoiVar.a, IOException.class));
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

    private static synchronized dzng b() {
        dzng dzngVar;
        synchronized (e.class) {
            if (a == null) {
                dzrf[] dzrfVarArr = new dzrf[1];
                dzrfVarArr[0] = fpmr.f() ? new btcq(new dzoa()) : new dzoa();
                a = new dzng(Arrays.asList(dzrfVarArr), Arrays.asList(new dzrr()));
            }
            dzngVar = a;
        }
        return dzngVar;
    }
}
