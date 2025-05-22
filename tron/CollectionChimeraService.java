package com.google.android.gms.tron;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.util.LruCache;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.tron.AppContextProvider;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.udc.UdcCacheRequest;
import defpackage.arvi;
import defpackage.arvq;
import defpackage.arvr;
import defpackage.arwu;
import defpackage.aszs;
import defpackage.atad;
import defpackage.atzs;
import defpackage.auid;
import defpackage.aumn;
import defpackage.aupq;
import defpackage.ausn;
import defpackage.bzlt;
import defpackage.bzlv;
import defpackage.bzlw;
import defpackage.bzna;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.diun;
import defpackage.diuo;
import defpackage.diuq;
import defpackage.diur;
import defpackage.dius;
import defpackage.diut;
import defpackage.dkbk;
import defpackage.dkbl;
import defpackage.dpxc;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fkqv;
import defpackage.fkqw;
import defpackage.fkuc;
import defpackage.fvjk;
import defpackage.fvjt;
import defpackage.fvjw;
import defpackage.gckt;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CollectionChimeraService extends Service implements diut {
    public static final UdcCacheRequest b;
    private static final int[] h;
    public bzlv d;
    public diuo e;
    public diur f;
    private boolean j;
    private diun k;
    private ArrayList l;
    private final MessageDigest n;
    private byte[] o;
    private aumn p;
    private diuq q;
    private gckt r;
    private Random s;
    private ModuleManager t;
    private ModuleManager.ModuleInfo u;
    public static final ausn a = ausn.b("CollectionChimeraSvc", auid.TRON);
    private static final Charset g = Charset.forName("UTF-8");
    public final Object c = new Object();
    private final LruCache m = new LruCache(100);
    private final SecureRandom i = new SecureRandom();

    static {
        int[] iArr = {8, 10};
        h = iArr;
        b = new UdcCacheRequest(iArr);
    }

    public CollectionChimeraService() {
        try {
            this.n = MessageDigest.getInstance("MD5");
            this.e = new diuo();
            if (!fvjt.a.lK().a()) {
                if (fvjw.d()) {
                    ((eluo) ((eluo) a.h()).ai((char) 11501)).x("NOT using new consent API");
                    return;
                }
                return;
            }
            diuo diuoVar = this.e;
            Context a2 = AppContextProvider.a();
            dkbk dkbkVar = new dkbk();
            aszs aszsVar = dkbl.a;
            diuoVar.c = new atad(a2, dkbkVar);
            if (fvjw.d()) {
                ((eluo) ((eluo) a.h()).ai((char) 11502)).x("Using new consent API");
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static Intent a(Context context) {
        return fvjw.f() ? new Intent("com.google.android.gms.tron.COLLECT").setPackage(context.getPackageName()) : new Intent().setClassName(context, "com.google.android.gms.tron.CollectionService");
    }

    public static boolean n(atad atadVar) {
        dhlw aI = atadVar.aI("TRON");
        try {
            dhmr.o(aI, 10000L, TimeUnit.MILLISECONDS);
            if (!aI.m() || aI.i() == null || !((Boolean) aI.i()).booleanValue()) {
                return false;
            }
            if (!fvjw.d()) {
                return true;
            }
            ((eluo) ((eluo) a.h()).ai((char) 11507)).x("Consent API says canLog is true");
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException | TimeoutException unused2) {
            return false;
        }
    }

    public final void b(fkqw fkqwVar) {
        if (this.l.contains(fkqwVar)) {
            return;
        }
        this.l.add(fkqwVar);
    }

    @Override // defpackage.diut
    public final void c(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fvjw.d();
        if (j == Long.MAX_VALUE) {
            return;
        }
        fvjw fvjwVar = fvjw.a;
        long min = Math.min(Math.max(j, (int) fvjwVar.lK().g()), (int) fvjwVar.lK().f());
        int i = AlarmChimeraReceiver.b;
        Intent intent = new Intent("com.google.android.gms.tron.ALARM");
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, fvjw.f() ? intent.setPackage(getPackageName()) : intent.setClassName(this, "com.google.android.gms.tron.AlarmReceiver"), 134217728);
        this.p.a(broadcast);
        this.p.d("CollectionChimeraSvc", 3, elapsedRealtime + min, broadcast, "com.google.android.gms");
    }

    @Override // defpackage.diut
    public final void d(diur diurVar) {
        diuq diuqVar = this.q;
        if (diuqVar != null) {
            Message obtainMessage = diuqVar.obtainMessage();
            obtainMessage.obj = diurVar;
            this.q.sendMessage(obtainMessage);
        }
    }

    final void e(fkqw fkqwVar, String str) {
        try {
            arvq i = this.k.a.i(fkqwVar);
            if (str != null) {
                i.p(str);
            }
            ExperimentTokens experimentTokens = this.f.d;
            if (experimentTokens != null) {
                if (i.a.f()) {
                    throw new IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
                }
                i.h = false;
                i.g(experimentTokens);
            }
            if (fvjk.e()) {
                i.p = dpxc.b(AppContextProvider.a(), new fkqv());
            }
            i.d();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // defpackage.diut
    public final boolean f() {
        boolean i;
        synchronized (this.c) {
            i = bzlw.i(this.d, "disable_old_visibility_logs", false);
        }
        return i;
    }

    @Override // defpackage.diut
    public final long g() {
        long b2;
        synchronized (this.c) {
            b2 = bzlw.b(this.d, "oc.lastProcessing", 0L);
        }
        return b2;
    }

    @Override // defpackage.diut
    public final diur h(dius diusVar) {
        return new diur(this, diusVar);
    }

    public final void i() {
        byte[] r = fvjw.a.lK().i().r();
        try {
            fgri y = fgri.y(gckt.a, r, 0, r.length, fgqp.a());
            fgri.M(y);
            this.r = (gckt) y;
        } catch (fgsd e) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 11516)).x("failed to decode rate configuration");
        }
    }

    @Override // defpackage.diut
    public final void j() {
        synchronized (this.c) {
            bzlt c = this.d.c();
            c.e("disable_old_visibility_logs", true);
            bzlw.f(c);
        }
    }

    @Override // defpackage.diut
    public final void k(long j) {
        synchronized (this.c) {
            bzlt c = this.d.c();
            c.g("oc.lastProcessing", j);
            bzlw.f(c);
        }
    }

    @Override // defpackage.diut
    public final fgrc l() {
        if (this.l.isEmpty()) {
            return fkqw.a.v();
        }
        fkqw fkqwVar = (fkqw) this.l.remove(0);
        fgrc fgrcVar = (fgrc) fkqwVar.iQ(5, null);
        fgrcVar.X(fkqwVar);
        if (fgrcVar.a.L()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        fgrcVar.b = fgrcVar.P();
        return fgrcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00db A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029e  */
    @Override // defpackage.diut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.fgrc r17) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tron.CollectionChimeraService.m(fgrc):void");
    }

    @Override // defpackage.diut
    public final void o() {
        fvjw.d();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.s = new Random(System.currentTimeMillis());
        this.j = false;
        if (getApplicationInfo().targetSdkVersion > 19) {
            this.l = new ArrayList();
            List list = arvr.n;
            arvr a2 = new arvi(this, "TRON").a();
            a2.h(fkuc.b((int) fvjw.b()));
            this.k = new diun(a2);
            new arwu(a2, "TRON_COUNTERS", 1024);
            this.d = bzna.a(this, "tron", "tron_prefs", 0);
            this.p = new aumn(this);
            if (fvjw.e()) {
                this.j = true;
            }
            aupq aupqVar = new aupq(10);
            aupqVar.start();
            this.q = new diuq(this, aupqVar);
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        diuq diuqVar = this.q;
        if (diuqVar != null) {
            diuqVar.d.shutdown();
        }
        this.q = null;
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final void onStart(Intent intent, int i) {
        if (this.j) {
            i();
            diur diurVar = new diur(this, 1);
            diurVar.b = i;
            if (intent != null) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.tron.extra.serializedExpTokens");
                diurVar.d = byteArrayExtra == null ? null : (ExperimentTokens) atzs.a(byteArrayExtra, ExperimentTokens.CREATOR);
                diurVar.h = intent.getIntExtra("com.google.android.gms.tron.extra.reason", 0);
            } else {
                diurVar.h = 6;
            }
            d(diurVar);
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return this.j ? 1 : 2;
    }

    @Override // defpackage.diut
    public final void p() {
        if (fvjk.d()) {
            return;
        }
        fvjw.d();
    }

    @Override // defpackage.diut
    public final void q() {
        if (fvjk.d()) {
            return;
        }
        fvjw.d();
    }
}
