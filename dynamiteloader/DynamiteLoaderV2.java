package com.google.android.gms.dynamiteloader;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.arxa;
import defpackage.arxd;
import defpackage.asnp;
import defpackage.asnx;
import defpackage.azht;
import defpackage.azix;
import defpackage.azjd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DynamiteLoaderV2 extends azjd {
    private final int a;
    private DynamiteFlags b;

    public DynamiteLoaderV2() {
        this(4);
    }

    private final synchronized DynamiteFlags a(Cursor cursor) {
        int columnIndex;
        byte[] blob;
        DynamiteFlags dynamiteFlags;
        if (this.b == null && (columnIndex = cursor.getColumnIndex("dynamiteFlags")) >= 0 && (blob = cursor.getBlob(columnIndex)) != null) {
            Parcelable.Creator creator = DynamiteFlags.CREATOR;
            try {
                dynamiteFlags = (DynamiteFlags) arxd.a(blob, DynamiteFlags.CREATOR);
            } catch (arxa e) {
                Log.w("DynamiteFlags", "Failed to parse DynamiteFlags", e);
                dynamiteFlags = null;
            }
            if (dynamiteFlags != null) {
                this.b = dynamiteFlags;
            }
        }
        if (this.b == null) {
            this.b = DynamiteFlags.a;
        }
        return this.b;
    }

    @Override // defpackage.azje
    public azht loadModule(azht azhtVar, String str, byte[] bArr) {
        azht loadModule2;
        Context context = (Context) ObjectWrapper.a(azhtVar);
        if (context == null) {
            return new ObjectWrapper(null);
        }
        Cursor d = azix.d(context.getApplicationContext(), str, false, 0L);
        if (d != null) {
            try {
                if (d.moveToFirst()) {
                    if (Arrays.equals(bArr, d.getBlob(1))) {
                        loadModule2 = loadModule2(azhtVar, str, d.getInt(0), new ObjectWrapper(d));
                    } else {
                        Log.e("DynamiteLoaderV2", "Module configuration has changed.");
                        loadModule2 = new ObjectWrapper(null);
                    }
                    d.close();
                    return loadModule2;
                }
            } catch (Throwable th) {
                if (d != null) {
                    try {
                        d.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        Log.e("DynamiteLoaderV2", "Failed to read query result");
        ObjectWrapper objectWrapper = new ObjectWrapper(null);
        if (d != null) {
            d.close();
        }
        return objectWrapper;
    }

    @Override // defpackage.azje
    public azht loadModule2(azht azhtVar, String str, int i, azht azhtVar2) {
        Context context = (Context) ObjectWrapper.a(azhtVar);
        if (context == null) {
            return new ObjectWrapper(null);
        }
        try {
            return loadModule2NoCrashUtils(azhtVar, str, i, azhtVar2);
        } catch (Throwable th) {
            if (!asnp.d()) {
                asnx.f(context, th);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0283, code lost:
    
        if (r7 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0287, code lost:
    
        android.os.StrictMode.setThreadPolicy(r6);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0171, code lost:
    
        defpackage.pwa.a().a(r4, 101);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x015e, code lost:
    
        r21 = r7.j(r0);
        r0 = r9.d;
        r19 = defpackage.anzk.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0168, code lost:
    
        if (r19 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x016a, code lost:
    
        android.util.Log.e("DynamiteLoaderV2Impl", "Failed to create dynamite context.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x017d, code lost:
    
        if (android.os.Build.SUPPORTED_64_BIT_ABIS.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0182, code lost:
    
        if (android.os.Build.SUPPORTED_32_BIT_ABIS.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0188, code lost:
    
        if (android.os.Process.is64Bit() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0196, code lost:
    
        if (r0.b().contains(r21.e()) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0198, code lost:
    
        defpackage.pwa.a().b(r4, 118, r21.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01ab, code lost:
    
        if (((com.google.android.gms.dynamiteloader.DynamiteFlags) r0).c == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ad, code lost:
    
        r2 = defpackage.pwa.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01b6, code lost:
    
        if (true == android.os.Process.is64Bit()) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01b8, code lost:
    
        r3 = 71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01bd, code lost:
    
        r2.b(r4, r3, r21.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01bb, code lost:
    
        r3 = 72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01c4, code lost:
    
        r2 = android.os.SystemClock.uptimeMillis();
        r7 = defpackage.puz.c().a(r19, r7, r21, null, r0).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01de, code lost:
    
        if (((com.google.android.gms.dynamiteloader.DynamiteFlags) r0).d == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01e0, code lost:
    
        if (r11 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01e2, code lost:
    
        r0 = com.google.android.gms.dynamite.RequestStats.a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01e6, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01e8, code lost:
    
        r8 = android.os.SystemClock.uptimeMillis();
        r0.f = r10;
        r0.g = r8 - r2;
        r0.h = r8;
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01f7, code lost:
    
        android.os.StrictMode.setThreadPolicy(r6);
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0203, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0206, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0200, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    @Override // defpackage.azje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.azht loadModule2NoCrashUtils(defpackage.azht r25, java.lang.String r26, int r27, defpackage.azht r28) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamiteloader.DynamiteLoaderV2.loadModule2NoCrashUtils(azht, java.lang.String, int, azht):azht");
    }

    public DynamiteLoaderV2(int i) {
        this.b = null;
        this.a = i;
    }
}
