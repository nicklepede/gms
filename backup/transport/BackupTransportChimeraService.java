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
import android.content.SharedPreferences;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.Service;
import com.google.android.gms.backup.transport.BackupTransportChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.ajiu;
import defpackage.ajjf;
import defpackage.ajql;
import defpackage.ajqx;
import defpackage.ajsb;
import defpackage.ajsd;
import defpackage.ajsg;
import defpackage.ajwt;
import defpackage.akca;
import defpackage.akdt;
import defpackage.akdw;
import defpackage.aked;
import defpackage.akej;
import defpackage.akeu;
import defpackage.akex;
import defpackage.amdb;
import defpackage.amdd;
import defpackage.amdn;
import defpackage.amdr;
import defpackage.amdy;
import defpackage.ameh;
import defpackage.amei;
import defpackage.amej;
import defpackage.amek;
import defpackage.amfe;
import defpackage.amnd;
import defpackage.amne;
import defpackage.atpx;
import defpackage.aupz;
import defpackage.aura;
import defpackage.aurt;
import defpackage.bnix;
import defpackage.caqj;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.enbn;
import defpackage.epzb;
import defpackage.epzd;
import defpackage.fgrc;
import defpackage.focc;
import defpackage.foci;
import defpackage.fogi;
import defpackage.ind;
import defpackage.oit;
import defpackage.oiu;
import defpackage.oiv;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupTransportChimeraService extends Service implements amei, amdn {
    public static final ajwt a = new ajwt("BackupTransportCS");
    public amdy c;
    public ameh d;
    private akca j;
    private atpx k;
    private atpx l;
    private akeu m;
    private final BroadcastReceiver n;
    private oit e = null;
    private oit f = null;
    public amdb b = null;
    private oiu g = null;
    private oiu h = null;
    private ajql i = null;

    public BackupTransportChimeraService() {
        akdt.a();
        this.n = new TracingBroadcastReceiver() { // from class: com.google.android.gms.backup.transport.BackupTransportChimeraService.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.PACKAGE_CHANGED".equals(action)) {
                    BackupTransportChimeraService backupTransportChimeraService = BackupTransportChimeraService.this;
                    if (backupTransportChimeraService.e()) {
                        BackupTransportChimeraService.a.d("Transport has been disabled, cancelling full backup", new Object[0]);
                        backupTransportChimeraService.d.cancelFullBackup();
                        return;
                    }
                    return;
                }
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    BackupTransportChimeraService.this.b.d();
                    return;
                }
                BackupTransportChimeraService backupTransportChimeraService2 = BackupTransportChimeraService.this;
                if (!BackupTransportChimeraService.f() || (!"android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(action) && !"com.google.android.gms.backup.BackupAccountChanged".equals(action))) {
                    BackupTransportChimeraService.a.m("Unexpected action %s received in broadcast receiver", action);
                } else {
                    backupTransportChimeraService2.d();
                    backupTransportChimeraService2.b.d();
                }
            }
        };
    }

    public static ComponentName b() {
        return ComponentName.unflattenFromString("com.google.android.gms/.backup.BackupTransportService");
    }

    public static final boolean f() {
        return !amfe.b();
    }

    private static akdw i(Exception exc) {
        akdw akdwVar = new akdw();
        akdwVar.initCause(exc);
        return akdwVar;
    }

    private final void j(Exception exc, oiu oiuVar, Exception exc2, int i, enbn enbnVar, int i2, long j, boolean z) {
        SharedPreferences sharedPreferences = oiuVar.a;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("OperationScheduler_lastErrorTimeMillis", System.currentTimeMillis());
        edit.putInt("OperationScheduler_errorCount", sharedPreferences.getInt("OperationScheduler_errorCount", 0) + 1);
        oiv.a(edit);
        long a2 = oiuVar.a(this.f);
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
            this.m.t(i, enbnVar, 3, i2);
            return;
        }
        ajwt ajwtVar = a;
        ajwtVar.m("Network error: proposed backoff of %dms considered too large, not retrying. Exception that caused this: %s", Long.valueOf(currentTimeMillis), exc.toString());
        this.m.t(i, enbnVar, 4, i2);
        if (j <= 0) {
            throw exc2;
        }
        long currentTimeMillis3 = System.currentTimeMillis() + j;
        oiuVar.b(currentTimeMillis3);
        ajwtVar.m("Setting moratorium: %d", Long.valueOf(currentTimeMillis3));
        throw exc2;
    }

    private final void k(fgrc fgrcVar, oiu oiuVar, enbn enbnVar) {
        ajjf ajjfVar = (ajjf) fgrcVar.b;
        int i = ajjfVar.b;
        if ((i & 1) == 0 || (ajjfVar.c <= 0 && (i & 2) == 0)) {
            long e = aura.e(this);
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            ajjf ajjfVar2 = (ajjf) fgrcVar.b;
            ajjfVar2.b |= 1;
            ajjfVar2.c = e;
            if (focc.c()) {
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                ajjf ajjfVar3 = (ajjf) fgrcVar.b;
                ajjfVar3.b |= 2;
                ajjfVar3.d = e;
            }
            if (((ajjf) fgrcVar.b).c != 0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() + 43200000;
            oiuVar.b(currentTimeMillis);
            a.m("Could not get a non-zero AndroidId. Moratorium: %d", Long.valueOf(currentTimeMillis));
            this.m.t(6, enbnVar, 4, 0);
            throw i(new AccountsException("No Android ID available"));
        }
    }

    private final boolean l(fgrc fgrcVar, Account account, oiu oiuVar, enbn enbnVar, boolean z) {
        String str = true != fogi.z() ? "android" : "oauth2:https://www.googleapis.com/auth/android_platform_backup_restore";
        ajwt ajwtVar = a;
        ajwtVar.j("Using %s scope '%s'", true != fogi.z() ? "ClientLogin" : "OAuth2", str);
        try {
            String b = akdt.b(this, account, str, foci.b());
            if (b != null) {
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                ajjf ajjfVar = (ajjf) fgrcVar.b;
                ajjf ajjfVar2 = ajjf.a;
                ajjfVar.b |= 16;
                ajjfVar.f = b;
            }
            if ((((ajjf) fgrcVar.b).b & 16) != 0) {
                return true;
            }
            ajwtVar.m("Could not obtain AuthToken.", new Object[0]);
            j(i(new AccountsException("No auth token available")), oiuVar, i(new AccountsException("No auth token available")), 5, enbnVar, 0, 43200000L, z);
            return false;
        } catch (AuthenticatorException e) {
            a.n("AuthenticationException when getting AuthToken", e, new Object[0]);
            j(e, oiuVar, i(e), 8, enbnVar, 0, 43200000L, z);
            return false;
        } catch (OperationCanceledException e2) {
            a.n("OperationCanceledException when getting AuthToken", e2, new Object[0]);
            j(e2, oiuVar, i(e2), 10, enbnVar, 0, 0L, z);
            return false;
        } catch (IOException e3) {
            a.n("IOException when getting AuthToken", e3, new Object[0]);
            akej akejVar = new akej();
            akejVar.initCause(e3);
            j(e3, oiuVar, akejVar, 12, enbnVar, 0, 0L, true);
            return true;
        }
    }

    final Account a(oiu oiuVar, enbn enbnVar) {
        Account a2 = this.c.a();
        if (a2 != null) {
            return a2;
        }
        long currentTimeMillis = System.currentTimeMillis() + 604800000;
        oiuVar.b(currentTimeMillis);
        a.m("Backup account missing, trying again later. Moratorium: %d", Long.valueOf(currentTimeMillis));
        this.m.s(4, enbnVar, 4);
        throw new aked();
    }

    public final synchronized ajql c() {
        if (this.i == null) {
            this.i = new ajql(this);
        }
        return this.i;
    }

    public final void d() {
        a.j("Accounts changed", new Object[0]);
        this.b.b(0L);
        this.g.b(0L);
        this.c.a();
    }

    public final boolean e() {
        return aura.a(this, "com.google.android.gms.backup.BackupTransportService") == 2;
    }

    @Override // defpackage.amdn
    public final fgrc g(String str, oiu oiuVar) {
        fgrc v = ajiu.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ajiu ajiuVar = (ajiu) v.b;
        str.getClass();
        ajiuVar.b |= 1;
        ajiuVar.c = str;
        ajiu ajiuVar2 = (ajiu) v.Q();
        fgrc v2 = ajjf.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        ajjf ajjfVar = (ajjf) v2.b;
        ajjfVar.b |= 64;
        ajjfVar.h = 3;
        v2.cF(ajiuVar2);
        ekvi b = this.j.b();
        if (b.h()) {
            String str2 = (String) b.c();
            if (!v2.b.L()) {
                v2.U();
            }
            ajjf ajjfVar2 = (ajjf) v2.b;
            ajjfVar2.b |= 1024;
            ajjfVar2.j = str2;
        }
        enbn enbnVar = enbn.FULL_BACKUP_REQUEST;
        Account a2 = a(oiuVar, enbnVar);
        k(v2, oiuVar, enbnVar);
        boolean z = true;
        while ((((ajjf) v2.b).b & 16) == 0) {
            try {
                oiu oiuVar2 = oiuVar;
                z = l(v2, a2, oiuVar2, enbnVar, z);
                oiuVar = oiuVar2;
            } catch (akej e) {
                throw i(new IOException(e));
            }
        }
        return v2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.amei
    public final defpackage.ajjp h(defpackage.enbn r21, defpackage.fgrc r22, defpackage.oiu r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.transport.BackupTransportChimeraService.h(enbn, fgrc, oiu, boolean):ajjp");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!intent.getBooleanExtra("android.app.backup.extra.TRANSPORT_REGISTRATION", false) && !f()) {
            new caqj(getMainLooper()).post(new Runnable() { // from class: amdc
                @Override // java.lang.Runnable
                public final void run() {
                    BackupTransportChimeraService backupTransportChimeraService = BackupTransportChimeraService.this;
                    ajql c = backupTransportChimeraService.c();
                    ComponentName b = BackupTransportChimeraService.b();
                    amdy amdyVar = backupTransportChimeraService.c;
                    auad auadVar = ameh.a;
                    c.g(b, new ameg(backupTransportChimeraService, amdyVar));
                }
            });
        }
        Intent intent2 = new Intent("com.google.android.gms.backup.NOTIFY_BACKUP_TRANSPORT_BOUND");
        intent2.putExtra("transport", "com.google.android.gms/.backup.BackupTransportService");
        intent2.setPackage(getPackageName());
        sendBroadcast(intent2);
        return this.d.getBinder();
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        amnd.d();
        this.m = new akeu(this);
        oit oitVar = new oit();
        this.e = oitVar;
        oitVar.b = 0L;
        fogi fogiVar = fogi.a;
        oitVar.a = epzd.h(1000L, fogiVar.lK().l());
        this.e.c = epzb.g(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, (int) fogiVar.lK().k());
        this.e.d = epzd.h(1000L, fogiVar.lK().m());
        oit oitVar2 = new oit();
        this.f = oitVar2;
        oitVar2.b = 0L;
        oitVar2.a = epzd.h(1000L, fogiVar.lK().f());
        this.f.c = epzb.g(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, (int) fogiVar.lK().e());
        if (this.b == null) {
            this.b = new amdb(this);
        }
        this.g = amne.a(this);
        this.h = new oiu(getSharedPreferences("GmsBackupTransport.abortScheduler", 0));
        BroadcastReceiver broadcastReceiver = this.n;
        ind.b(this, broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
        ind.b(this, broadcastReceiver, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"), 2);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        ind.b(this, broadcastReceiver, intentFilter, 2);
        ind.b(this, broadcastReceiver, new IntentFilter("com.google.android.gms.backup.BackupAccountChanged"), true == fogiVar.lK().au() ? 4 : 2);
        if (this.c == null) {
            this.c = new amdy(this);
        }
        if (this.j == null) {
            this.j = akca.a(this);
        }
        this.k = new atpx(this, "cloud_restore", true);
        this.l = new atpx(this, "BackupDeviceState", true);
        oiu oiuVar = this.h;
        amdy amdyVar = this.c;
        amdb amdbVar = this.b;
        akeu akeuVar = this.m;
        oit oitVar3 = this.e;
        atpx atpxVar = this.k;
        atpx atpxVar2 = this.l;
        bnix bnixVar = new bnix(this);
        ajsg a2 = akex.a(this);
        oiu oiuVar2 = this.g;
        this.d = new ameh(this, this, this, this, oiuVar, amdyVar, amdbVar, akeuVar, oitVar3, atpxVar, atpxVar2, bnixVar, a2, new amek(this, oiuVar2), new amdr(), new amdd(this), ajsb.a(this), new amej(this, aurt.a), c(), Build.VERSION.SDK_INT >= 28 ? ekvi.j(ajsd.d(this)) : ektg.a, new ajqx(this));
        new caqj(getMainLooper()).post(new Runnable() { // from class: amde
            @Override // java.lang.Runnable
            public final void run() {
                BackupTransportChimeraService backupTransportChimeraService = BackupTransportChimeraService.this;
                backupTransportChimeraService.b.d();
                if (BackupTransportChimeraService.f()) {
                    backupTransportChimeraService.d();
                }
            }
        });
        new aupz(1, 10).execute(new Runnable() { // from class: amdf
            @Override // java.lang.Runnable
            public final void run() {
                akcn.i(BackupTransportChimeraService.this);
            }
        });
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        try {
            unregisterReceiver(this.n);
        } catch (IllegalArgumentException | IllegalStateException e) {
            a.n("Exception when unregistering: ", e, new Object[0]);
        }
        super.onDestroy();
    }
}
