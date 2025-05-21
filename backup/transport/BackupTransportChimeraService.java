package com.google.android.gms.backup.transport;

import android.accounts.Account;
import android.accounts.AccountsException;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.Service;
import com.google.android.gms.backup.transport.BackupTransportChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.ahie;
import defpackage.ahip;
import defpackage.ahiz;
import defpackage.ahpv;
import defpackage.ahqh;
import defpackage.ahrk;
import defpackage.ahrm;
import defpackage.ahrq;
import defpackage.ahwd;
import defpackage.aibb;
import defpackage.aibd;
import defpackage.aibk;
import defpackage.aidd;
import defpackage.aidg;
import defpackage.aidh;
import defpackage.aidk;
import defpackage.aidn;
import defpackage.aidq;
import defpackage.aidr;
import defpackage.aids;
import defpackage.aidt;
import defpackage.aidy;
import defpackage.aidz;
import defpackage.aiee;
import defpackage.aieh;
import defpackage.akcd;
import defpackage.akcf;
import defpackage.akcl;
import defpackage.akcq;
import defpackage.akcu;
import defpackage.akdb;
import defpackage.akdk;
import defpackage.akdl;
import defpackage.akdm;
import defpackage.akdn;
import defpackage.akeh;
import defpackage.akma;
import defpackage.akmb;
import defpackage.arni;
import defpackage.asmf;
import defpackage.asng;
import defpackage.asnz;
import defpackage.asqh;
import defpackage.blcf;
import defpackage.bqna;
import defpackage.byhr;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ekob;
import defpackage.enlk;
import defpackage.enlm;
import defpackage.fecj;
import defpackage.flks;
import defpackage.flky;
import defpackage.floy;
import defpackage.iln;
import defpackage.mql;
import defpackage.mqm;
import defpackage.mqn;
import defpackage.unx;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupTransportChimeraService extends Service implements akdl, akcq {
    public static final ahwd a = new ahwd("BackupTransportCS");
    public akdb b;
    public akdk c;
    private mql d = null;
    private mql e = null;
    private akcd f = null;
    private mqm g = null;
    private mqm h = null;
    private ahpv i = null;
    private aibk j;
    private arni k;
    private arni l;
    private akcl m;
    private aiee n;
    private final BroadcastReceiver o;

    public BackupTransportChimeraService() {
        aidd.a();
        this.o = new TracingBroadcastReceiver() { // from class: com.google.android.gms.backup.transport.BackupTransportChimeraService.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.PACKAGE_CHANGED".equals(action)) {
                    BackupTransportChimeraService backupTransportChimeraService = BackupTransportChimeraService.this;
                    if (backupTransportChimeraService.f()) {
                        BackupTransportChimeraService.a.d("Transport has been disabled, cancelling full backup", new Object[0]);
                        backupTransportChimeraService.c.cancelFullBackup();
                        return;
                    }
                    return;
                }
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    BackupTransportChimeraService.this.e(isInitialStickyBroadcast());
                    return;
                }
                BackupTransportChimeraService backupTransportChimeraService2 = BackupTransportChimeraService.this;
                if (!BackupTransportChimeraService.g() || (!"android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(action) && !"com.google.android.gms.backup.BackupAccountChanged".equals(action))) {
                    BackupTransportChimeraService.a.m("Unexpected action %s received in broadcast receiver", action);
                } else {
                    backupTransportChimeraService2.d();
                    backupTransportChimeraService2.e(isInitialStickyBroadcast());
                }
            }
        };
    }

    public static ComponentName b() {
        return ComponentName.unflattenFromString("com.google.android.gms/.backup.BackupTransportService");
    }

    public static final boolean g() {
        return !akeh.b();
    }

    private static aidg j(Exception exc) {
        aidg aidgVar = new aidg();
        aidgVar.initCause(exc);
        return aidgVar;
    }

    private final void k(Exception exc, mqm mqmVar, Exception exc2, int i, ekob ekobVar, int i2, long j, boolean z) {
        mqmVar.c();
        long a2 = mqmVar.a(this.e);
        long currentTimeMillis = a2 - System.currentTimeMillis();
        long j2 = 0;
        if (currentTimeMillis <= 30000 && z) {
            a.m("Network error: waiting until time %d (delay of %dms) to retry: ", Long.valueOf(a2), Long.valueOf(currentTimeMillis), exc);
            while (true) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 >= j2 && currentTimeMillis2 < a2) {
                    SystemClock.sleep(Math.min(a2 - currentTimeMillis2, 1000L));
                    j2 = currentTimeMillis2;
                }
            }
            this.n.t(i, ekobVar, 3, i2);
            return;
        }
        ahwd ahwdVar = a;
        ahwdVar.m("Network error: proposed backoff of %dms considered too large, not retrying. Exception that caused this: %s", Long.valueOf(currentTimeMillis), exc.toString());
        this.n.t(i, ekobVar, 4, i2);
        if (j <= 0) {
            throw exc2;
        }
        long currentTimeMillis3 = System.currentTimeMillis() + j;
        mqmVar.d(currentTimeMillis3);
        ahwdVar.m("Setting moratorium: %d", Long.valueOf(currentTimeMillis3));
        throw exc2;
    }

    private final void l(fecj fecjVar, mqm mqmVar, ekob ekobVar) {
        ahip ahipVar = (ahip) fecjVar.b;
        int i = ahipVar.b;
        if ((i & 1) == 0 || (ahipVar.c <= 0 && (i & 2) == 0)) {
            long e = asng.e(this);
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            ahip ahipVar2 = (ahip) fecjVar.b;
            ahipVar2.b |= 1;
            ahipVar2.c = e;
            if (flks.c()) {
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                ahip ahipVar3 = (ahip) fecjVar.b;
                ahipVar3.b |= 2;
                ahipVar3.d = e;
            }
            if (((ahip) fecjVar.b).c != 0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() + 43200000;
            mqmVar.d(currentTimeMillis);
            a.m("Could not get a non-zero AndroidId. Moratorium: %d", Long.valueOf(currentTimeMillis));
            this.n.t(6, ekobVar, 4, 0);
            throw j(new AccountsException("No Android ID available"));
        }
    }

    private final boolean m(fecj fecjVar, Account account, mqm mqmVar, ekob ekobVar, boolean z) {
        String str = true != floy.A() ? "android" : "oauth2:https://www.googleapis.com/auth/android_platform_backup_restore";
        ahwd ahwdVar = a;
        ahwdVar.j("Using %s scope '%s'", true != floy.A() ? "ClientLogin" : "OAuth2", str);
        try {
            String b = aidd.b(this, account, str, flky.b());
            if (b != null) {
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                ahip ahipVar = (ahip) fecjVar.b;
                ahip ahipVar2 = ahip.a;
                ahipVar.b |= 16;
                ahipVar.f = b;
            }
            if ((((ahip) fecjVar.b).b & 16) != 0) {
                return true;
            }
            ahwdVar.m("Could not obtain AuthToken.", new Object[0]);
            k(j(new AccountsException("No auth token available")), mqmVar, j(new AccountsException("No auth token available")), 5, ekobVar, 0, 43200000L, z);
            return false;
        } catch (AuthenticatorException e) {
            a.n("AuthenticationException when getting AuthToken", e, new Object[0]);
            k(e, mqmVar, j(e), 8, ekobVar, 0, 43200000L, z);
            return false;
        } catch (OperationCanceledException e2) {
            a.n("OperationCanceledException when getting AuthToken", e2, new Object[0]);
            k(e2, mqmVar, j(e2), 10, ekobVar, 0, 0L, z);
            return false;
        } catch (IOException e3) {
            a.n("IOException when getting AuthToken", e3, new Object[0]);
            aidt aidtVar = new aidt();
            aidtVar.initCause(e3);
            k(e3, mqmVar, aidtVar, 12, ekobVar, 0, 0L, true);
            return true;
        }
    }

    final Account a(mqm mqmVar, ekob ekobVar) {
        Account a2 = this.b.a();
        if (a2 != null) {
            return a2;
        }
        long currentTimeMillis = System.currentTimeMillis() + 604800000;
        mqmVar.d(currentTimeMillis);
        a.m("Backup account missing, trying again later. Moratorium: %d", Long.valueOf(currentTimeMillis));
        this.n.s(4, ekobVar, 4);
        throw new aidn();
    }

    public final synchronized ahpv c() {
        if (this.i == null) {
            this.i = new ahpv(this);
        }
        return this.i;
    }

    public final void d() {
        a.j("Accounts changed", new Object[0]);
        this.f.d(0L);
        this.g.d(0L);
        this.b.a();
    }

    public final void e(boolean z) {
        int i;
        akcd akcdVar = this.f;
        ConnectivityManager connectivityManager = (ConnectivityManager) akcdVar.c.getSystemService("connectivity");
        if (connectivityManager == null) {
            i = 2;
        } else {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 4;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                i = 1;
            }
        }
        boolean z2 = i == 1;
        akcd.b.d("Setting backup scheduler enabled=%b due to desired state %d", Boolean.valueOf(z2), Integer.valueOf(i));
        if (z2) {
            akcdVar.d = 1;
        } else {
            akcdVar.d = 5;
        }
        mqn.a(akcdVar.a.edit().putBoolean("OperationScheduler_enabledState", z2));
        akcdVar.d = i;
        if (floy.a.a().ai()) {
            a.h("Triggering backup on network change disabled", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || !z) {
            if (this.f.a(this.d) > System.currentTimeMillis()) {
                a.j("no backup now", new Object[0]);
                return;
            }
            ahpv c = c();
            if (c == null) {
                a.f("No BackupManager service available", new Object[0]);
                return;
            }
            a.j("triggering backup now", new Object[0]);
            this.f.e(Long.MAX_VALUE);
            if (asqh.f()) {
                c.e();
                return;
            }
            try {
                c.e();
            } catch (IllegalArgumentException e) {
                a.g("Error while trying to backup now.", e, new Object[0]);
            }
        }
    }

    public final boolean f() {
        return asng.a(this, "com.google.android.gms.backup.BackupTransportService") == 2;
    }

    @Override // defpackage.akcq
    public final fecj h(String str, mqm mqmVar) {
        fecj v = ahie.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ahie ahieVar = (ahie) v.b;
        str.getClass();
        ahieVar.b |= 1;
        ahieVar.c = str;
        ahie ahieVar2 = (ahie) v.Q();
        fecj v2 = ahip.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        ahip ahipVar = (ahip) v2.b;
        ahipVar.b |= 64;
        ahipVar.h = 3;
        v2.cF(ahieVar2);
        eiid b = this.j.b();
        if (b.h()) {
            String str2 = (String) b.c();
            if (!v2.b.L()) {
                v2.U();
            }
            ahip ahipVar2 = (ahip) v2.b;
            ahipVar2.b |= 1024;
            ahipVar2.j = str2;
        }
        ekob ekobVar = ekob.FULL_BACKUP_REQUEST;
        Account a2 = a(mqmVar, ekobVar);
        l(v2, mqmVar, ekobVar);
        boolean z = true;
        while ((((ahip) v2.b).b & 16) == 0) {
            try {
                mqm mqmVar2 = mqmVar;
                z = m(v2, a2, mqmVar2, ekobVar, z);
                mqmVar = mqmVar2;
            } catch (aidt e) {
                throw j(new IOException(e));
            }
        }
        return v2;
    }

    @Override // defpackage.akdl
    public final ahiz i(ekob ekobVar, fecj fecjVar, mqm mqmVar, boolean z) {
        BackupTransportChimeraService backupTransportChimeraService = this;
        ekob ekobVar2 = ekobVar;
        fecj fecjVar2 = fecjVar;
        mqm mqmVar2 = mqmVar;
        if (!Thread.holdsLock(backupTransportChimeraService.c)) {
            throw new IllegalStateException("lock not held");
        }
        bqna b = bqna.b(backupTransportChimeraService);
        Account a2 = backupTransportChimeraService.a(mqmVar2, ekobVar2);
        backupTransportChimeraService.l(fecjVar2, mqmVar2, ekobVar2);
        aibb a3 = aibb.a(backupTransportChimeraService);
        boolean z2 = true;
        boolean z3 = true;
        while (true) {
            if (!z && (((ahip) fecjVar2.b).b & 8192) == 0 && mqmVar2.a(backupTransportChimeraService.e) > System.currentTimeMillis()) {
                backupTransportChimeraService.n.u(3, ekobVar, 4, 0, mqmVar2 instanceof akcd ? ((akcd) mqmVar2).d : 0);
                throw new aidr(mqmVar2);
            }
            if ((((ahip) fecjVar2.b).b & 16) != 0) {
                try {
                    ahiz b2 = a3.b(a2, fecjVar2, mqmVar2, z);
                    try {
                        aibd.b(b2);
                        mqmVar2.b();
                        return b2;
                    } catch (aidh e) {
                        ahip ahipVar = (ahip) fecjVar2.b;
                        if ((ahipVar.b & 16) != 0) {
                            b.h("com.google", ahipVar.f);
                            if (!fecjVar2.b.L()) {
                                fecjVar2.U();
                            }
                            ahip ahipVar2 = (ahip) fecjVar2.b;
                            ahipVar2.b &= -17;
                            ahipVar2.f = ahip.a.f;
                        }
                        a.m("Server returned error, invalidating auth token. This is retried once.", new Object[0]);
                        backupTransportChimeraService = this;
                        ekobVar2 = ekobVar;
                        boolean z4 = z3;
                        z3 = false;
                        backupTransportChimeraService.k(e, mqmVar, e, 8, ekobVar2, 0, 43200000L, z4);
                    } catch (aidq e2) {
                        e = e2;
                        backupTransportChimeraService.n.s(e.b(), ekobVar2, 4);
                        throw e;
                    } catch (aids e3) {
                        e = e3;
                        backupTransportChimeraService.n.s(e.b(), ekobVar2, 4);
                        throw e;
                    } catch (aidy e4) {
                        e = e4;
                        backupTransportChimeraService.n.s(e.b(), ekobVar2, 4);
                        throw e;
                    } catch (aidz e5) {
                        e = e5;
                        backupTransportChimeraService.n.s(e.b(), ekobVar2, 4);
                        throw e;
                    } catch (IOException e6) {
                        a.m("IOException when parsing response from server.", new Object[0]);
                        aidt aidtVar = new aidt();
                        aidtVar.initCause(e6);
                        backupTransportChimeraService.k(e6, mqmVar, aidtVar, 11, ekobVar2, 0, 0L, true);
                        backupTransportChimeraService = this;
                        ekobVar2 = ekobVar;
                        mqmVar2 = mqmVar;
                    }
                } catch (aidk e7) {
                    k(e7, mqmVar, e7, 2, ekobVar, e7.a, 0L, true);
                } catch (IOException e8) {
                    aidt aidtVar2 = new aidt();
                    aidtVar2.initCause(e8);
                    k(e8, mqmVar, aidtVar2, 9, ekobVar, 0, 0L, true);
                } catch (unx e9) {
                    k(e9, mqmVar, j(e9), 7, ekobVar, 0, 43200000L, false);
                }
            } else {
                z2 = backupTransportChimeraService.m(fecjVar2, a2, mqmVar2, ekobVar2, z2);
                backupTransportChimeraService = this;
                ekobVar2 = ekobVar;
                fecjVar2 = fecjVar;
            }
            mqmVar2 = mqmVar;
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!intent.getBooleanExtra("android.app.backup.extra.TRANSPORT_REGISTRATION", false) && !g()) {
            new byhr(getMainLooper()).post(new Runnable() { // from class: akce
                @Override // java.lang.Runnable
                public final void run() {
                    BackupTransportChimeraService backupTransportChimeraService = BackupTransportChimeraService.this;
                    ahpv c = backupTransportChimeraService.c();
                    ComponentName b = BackupTransportChimeraService.b();
                    akdb akdbVar = backupTransportChimeraService.b;
                    arxo arxoVar = akdk.a;
                    c.h(b, new akdj(backupTransportChimeraService, akdbVar));
                }
            });
        }
        Intent intent2 = new Intent("com.google.android.gms.backup.NOTIFY_BACKUP_TRANSPORT_BOUND");
        intent2.putExtra("transport", "com.google.android.gms/.backup.BackupTransportService");
        intent2.setPackage(getPackageName());
        sendBroadcast(intent2);
        return this.c.getBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        akma.d();
        this.n = new aiee(this);
        this.m = new akcl(this);
        mql mqlVar = new mql();
        this.d = mqlVar;
        mqlVar.b = 0L;
        mqlVar.a = enlm.g(1000L, floy.a.a().p());
        mql mqlVar2 = this.d;
        floy floyVar = floy.a;
        mqlVar2.c = enlk.g(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, (int) floyVar.a().o());
        this.d.d = enlm.g(1000L, floyVar.a().q());
        mql mqlVar3 = new mql();
        this.e = mqlVar3;
        mqlVar3.b = 0L;
        mqlVar3.a = enlm.g(1000L, floyVar.a().j());
        this.e.c = enlk.g(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, (int) floyVar.a().i());
        if (this.f == null) {
            this.f = new akcd(this);
        }
        this.g = akmb.a(this);
        this.h = new mqm(getSharedPreferences("GmsBackupTransport.abortScheduler", 0));
        BroadcastReceiver broadcastReceiver = this.o;
        iln.b(this, broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
        iln.b(this, broadcastReceiver, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"), 2);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        iln.b(this, broadcastReceiver, intentFilter, 2);
        iln.b(this, broadcastReceiver, new IntentFilter("com.google.android.gms.backup.BackupAccountChanged"), true == floyVar.a().aB() ? 4 : 2);
        if (this.b == null) {
            this.b = new akdb(this);
        }
        if (this.j == null) {
            this.j = aibk.a(this);
        }
        this.k = new arni(this, "cloud_restore", true);
        this.l = new arni(this, "BackupDeviceState", true);
        mqm mqmVar = this.h;
        akdb akdbVar = this.b;
        akcd akcdVar = this.f;
        aiee aieeVar = this.n;
        akcl akclVar = this.m;
        mql mqlVar4 = this.d;
        arni arniVar = this.k;
        arni arniVar2 = this.l;
        blcf blcfVar = new blcf(this);
        ahrq a2 = aieh.a(this);
        mqm mqmVar2 = this.g;
        this.c = new akdk(this, this, this, this, mqmVar, akdbVar, akcdVar, aieeVar, akclVar, mqlVar4, arniVar, arniVar2, blcfVar, a2, new akdn(this, mqmVar2), new akcu(), new akcf(this), ahrk.a(this), new akdm(this, asnz.a), c(), Build.VERSION.SDK_INT >= 28 ? eiid.j(ahrm.d(this)) : eigb.a, new ahqh(this));
        new byhr(getMainLooper()).post(new Runnable() { // from class: akcg
            @Override // java.lang.Runnable
            public final void run() {
                BackupTransportChimeraService backupTransportChimeraService = BackupTransportChimeraService.this;
                backupTransportChimeraService.e(true);
                if (BackupTransportChimeraService.g()) {
                    backupTransportChimeraService.d();
                }
            }
        });
        new asmf(1, 10).execute(new Runnable() { // from class: akch
            @Override // java.lang.Runnable
            public final void run() {
                aibx.g(BackupTransportChimeraService.this);
            }
        });
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        try {
            unregisterReceiver(this.o);
        } catch (IllegalArgumentException | IllegalStateException e) {
            a.n("Exception when unregistering: ", e, new Object[0]);
        }
        super.onDestroy();
    }
}
