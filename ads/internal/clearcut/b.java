package com.google.android.gms.ads.internal.clearcut;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.m;
import defpackage.bqux;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedb;
import defpackage.fedu;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b {
    private final g a;
    private final boolean b;
    private final fecj c;

    public b() {
        this.c = i.a.v();
        this.b = false;
        this.a = new g();
    }

    private final synchronized String c(int i) {
        fecj fecjVar;
        String str;
        fecjVar = this.c;
        str = ((i) fecjVar.b).c;
        com.google.android.gms.ads.internal.c.j();
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", str, Long.valueOf(SystemClock.elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((i) fecjVar.Q()).r(), 3));
    }

    private final synchronized void d(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(bqux.a.b(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(c(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
            } catch (IOException unused4) {
            }
        } catch (FileNotFoundException unused5) {
        }
    }

    private final synchronized void e(int i) {
        fecj fecjVar = this.c;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        i iVar = (i) fecjVar.b;
        i iVar2 = i.a;
        iVar.d = fedu.a;
        List b = m.b();
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        i iVar3 = (i) fecjVar.b;
        fedb fedbVar = iVar3.d;
        if (!fedbVar.c()) {
            iVar3.d = fecp.D(fedbVar);
        }
        feab.E(b, iVar3.d);
        f fVar = new f(this.a, ((i) fecjVar.Q()).r());
        int i2 = i - 1;
        fVar.a = i2;
        fVar.b();
        Integer.toString(i2, 10);
    }

    public final synchronized void a(a aVar) {
        if (this.b) {
            try {
                aVar.a(this.c);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.c.d().d(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void b(int i) {
        if (this.b) {
            if (((Boolean) p.aB.g()).booleanValue()) {
                d(i);
            } else {
                e(i);
            }
        }
    }

    public b(g gVar) {
        this.c = i.a.v();
        this.a = gVar;
        this.b = ((Boolean) p.aA.g()).booleanValue();
    }
}
