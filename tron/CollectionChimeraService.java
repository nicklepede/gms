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
import defpackage.apsr;
import defpackage.apsz;
import defpackage.apta;
import defpackage.apud;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.arxd;
import defpackage.asej;
import defpackage.asit;
import defpackage.aslw;
import defpackage.asot;
import defpackage.bxdd;
import defpackage.bxdf;
import defpackage.bxdg;
import defpackage.bxek;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.dgji;
import defpackage.dgjj;
import defpackage.dgjl;
import defpackage.dgjm;
import defpackage.dgjn;
import defpackage.dgjo;
import defpackage.dhqe;
import defpackage.dhqf;
import defpackage.dnmt;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fiay;
import defpackage.fiaz;
import defpackage.fief;
import defpackage.fsnz;
import defpackage.fsoi;
import defpackage.fsol;
import defpackage.fznz;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CollectionChimeraService extends Service implements dgjo {
    public static final UdcCacheRequest b;
    private static final int[] h;
    public bxdf d;
    public dgjj e;
    public dgjm f;
    private boolean j;
    private dgji k;
    private ArrayList l;
    private final MessageDigest n;
    private byte[] o;
    private asit p;
    private dgjl q;
    private fznz r;
    private Random s;
    private ModuleManager t;
    private ModuleManager.ModuleInfo u;
    public static final asot a = asot.b("CollectionChimeraSvc", asej.TRON);
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
            this.e = new dgjj();
            if (!fsoi.a.a().a()) {
                if (fsol.d()) {
                    ((ejhf) ((ejhf) a.h()).ah((char) 11498)).x("NOT using new consent API");
                    return;
                }
                return;
            }
            dgjj dgjjVar = this.e;
            Context a2 = AppContextProvider.a();
            dhqe dhqeVar = new dhqe();
            aqxd aqxdVar = dhqf.a;
            dgjjVar.c = new aqxo(a2, dhqeVar);
            if (fsol.d()) {
                ((ejhf) ((ejhf) a.h()).ah((char) 11499)).x("Using new consent API");
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static Intent a(Context context) {
        return fsol.f() ? new Intent("com.google.android.gms.tron.COLLECT").setPackage(context.getPackageName()) : new Intent().setClassName(context, "com.google.android.gms.tron.CollectionService");
    }

    public static boolean n(aqxo aqxoVar) {
        dfaq aJ = aqxoVar.aJ("TRON");
        try {
            dfbl.o(aJ, 10000L, TimeUnit.MILLISECONDS);
            if (!aJ.m() || aJ.i() == null || !((Boolean) aJ.i()).booleanValue()) {
                return false;
            }
            if (!fsol.d()) {
                return true;
            }
            ((ejhf) ((ejhf) a.h()).ah((char) 11504)).x("Consent API says canLog is true");
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException | TimeoutException unused2) {
            return false;
        }
    }

    public final void b(fiaz fiazVar) {
        if (this.l.contains(fiazVar)) {
            return;
        }
        this.l.add(fiazVar);
    }

    @Override // defpackage.dgjo
    public final void c(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fsol.d();
        if (j == Long.MAX_VALUE) {
            return;
        }
        long min = Math.min(Math.max(j, (int) fsol.a.a().g()), (int) fsol.a.a().f());
        int i = AlarmChimeraReceiver.b;
        Intent intent = new Intent("com.google.android.gms.tron.ALARM");
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, fsol.f() ? intent.setPackage(getPackageName()) : intent.setClassName(this, "com.google.android.gms.tron.AlarmReceiver"), 134217728);
        this.p.a(broadcast);
        this.p.d("CollectionChimeraSvc", 3, elapsedRealtime + min, broadcast, "com.google.android.gms");
    }

    @Override // defpackage.dgjo
    public final void d(dgjm dgjmVar) {
        dgjl dgjlVar = this.q;
        if (dgjlVar != null) {
            Message obtainMessage = dgjlVar.obtainMessage();
            obtainMessage.obj = dgjmVar;
            this.q.sendMessage(obtainMessage);
        }
    }

    final void e(fiaz fiazVar, String str) {
        try {
            apsz i = this.k.a.i(fiazVar);
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
            if (fsnz.e()) {
                i.p = dnmt.b(AppContextProvider.a(), new fiay());
            }
            i.d();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // defpackage.dgjo
    public final boolean f() {
        boolean i;
        synchronized (this.c) {
            i = bxdg.i(this.d, "disable_old_visibility_logs", false);
        }
        return i;
    }

    @Override // defpackage.dgjo
    public final long g() {
        long b2;
        synchronized (this.c) {
            b2 = bxdg.b(this.d, "oc.lastProcessing", 0L);
        }
        return b2;
    }

    @Override // defpackage.dgjo
    public final dgjm h(dgjn dgjnVar) {
        return new dgjm(this, dgjnVar);
    }

    public final void i() {
        fznz i = fsol.a.a().i();
        byte[] r = i != null ? i.r() : null;
        try {
            if (r == null) {
                this.r = null;
                return;
            }
            fecp y = fecp.y(fznz.a, r, 0, r.length, febw.a());
            fecp.M(y);
            this.r = (fznz) y;
        } catch (fedk e) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 11513)).x("failed to decode rate configuration");
        }
    }

    @Override // defpackage.dgjo
    public final void j() {
        synchronized (this.c) {
            bxdd c = this.d.c();
            c.e("disable_old_visibility_logs", true);
            bxdg.f(c);
        }
    }

    @Override // defpackage.dgjo
    public final void k(long j) {
        synchronized (this.c) {
            bxdd c = this.d.c();
            c.g("oc.lastProcessing", j);
            bxdg.f(c);
        }
    }

    @Override // defpackage.dgjo
    public final fecj l() {
        if (this.l.isEmpty()) {
            return fiaz.a.v();
        }
        fiaz fiazVar = (fiaz) this.l.remove(0);
        fecj fecjVar = (fecj) fiazVar.iB(5, null);
        fecjVar.X(fiazVar);
        if (fecjVar.a.L()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        fecjVar.b = fecjVar.P();
        return fecjVar;
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
    @Override // defpackage.dgjo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.fecj r17) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tron.CollectionChimeraService.m(fecj):void");
    }

    @Override // defpackage.dgjo
    public final void o() {
        fsol.d();
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
            List list = apta.n;
            apta a2 = new apsr(this, "TRON").a();
            a2.h(fief.b((int) fsol.b()));
            this.k = new dgji(a2);
            new apud(a2, "TRON_COUNTERS", 1024);
            this.d = bxek.a(this, "tron", "tron_prefs", 0);
            this.p = new asit(this);
            if (fsol.e()) {
                this.j = true;
            }
            aslw aslwVar = new aslw(10);
            aslwVar.start();
            this.q = new dgjl(this, aslwVar);
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        dgjl dgjlVar = this.q;
        if (dgjlVar != null) {
            dgjlVar.d.shutdown();
        }
        this.q = null;
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final void onStart(Intent intent, int i) {
        if (this.j) {
            i();
            dgjm dgjmVar = new dgjm(this, 1);
            dgjmVar.b = i;
            if (intent != null) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.tron.extra.serializedExpTokens");
                dgjmVar.d = byteArrayExtra == null ? null : (ExperimentTokens) arxd.a(byteArrayExtra, ExperimentTokens.CREATOR);
                dgjmVar.h = intent.getIntExtra("com.google.android.gms.tron.extra.reason", 0);
            } else {
                dgjmVar.h = 6;
            }
            d(dgjmVar);
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return this.j ? 1 : 2;
    }

    @Override // defpackage.dgjo
    public final void p() {
        if (fsnz.d()) {
            return;
        }
        fsol.d();
    }

    @Override // defpackage.dgjo
    public final void q() {
        if (fsnz.d()) {
            return;
        }
        fsol.d();
    }
}
