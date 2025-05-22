package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.service.quicksettings.Tile;
import com.google.android.chimera.TileService;
import com.google.android.gms.R;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.DeviceVisibility;
import com.google.android.gms.nearby.sharing.SharingChimeraTileService;
import defpackage.aupz;
import defpackage.auub;
import defpackage.chdw;
import defpackage.chke;
import defpackage.cojh;
import defpackage.coks;
import defpackage.colj;
import defpackage.colp;
import defpackage.conm;
import defpackage.coog;
import defpackage.ctuu;
import defpackage.ctvb;
import defpackage.dhkz;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.dhma;
import defpackage.dyph;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.ezuc;
import defpackage.falh;
import defpackage.famr;
import defpackage.fans;
import defpackage.fgrc;
import defpackage.ftdn;
import defpackage.ftgf;
import defpackage.ftgi;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SharingChimeraTileService extends TileService {
    public static final /* synthetic */ int d = 0;
    private static final AtomicInteger e = new AtomicInteger(new SecureRandom().nextInt());
    public colj a;
    public ekww c;
    private cojh f;
    private boolean g;
    private boolean h;
    private int i = -1;
    final ExecutorService b = new aupz(1, 9);
    private BroadcastReceiver j = null;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.nearby.sharing.SharingChimeraTileService$1, reason: invalid class name */
    public class AnonymousClass1 extends TracingBroadcastReceiver {
        public AnonymousClass1(Context context) {
            super(context);
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            conm.a.b().p("Invalidate tile state due to state change.", new Object[0]);
            SharingChimeraTileService.this.a().i().z(new dhlq() { // from class: cojf
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    int i = ((DeviceVisibility) obj).f;
                    boolean z = i != 0;
                    SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                    sharingChimeraTileService.d(z);
                    sharingChimeraTileService.e(i);
                }
            });
        }
    }

    public final cojh a() {
        if (this.f == null) {
            this.f = chdw.e(this);
        }
        return this.f;
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b(boolean z) {
        Icon f;
        int state;
        String str;
        Tile qsTile = getQsTile();
        if (qsTile == null) {
            conm.a.b().p("Failed to invalidate tile state.", new Object[0]);
            return;
        }
        this.h = ezuc.b(this);
        if (z) {
            qsTile.setLabel(getResources().getString(R.string.sharing_product_name_v3));
        } else {
            qsTile.setLabel(getResources().getString(R.string.sharing_product_name));
        }
        boolean g = ctvb.g(this);
        if (auub.f()) {
            if (g) {
                if (this.h) {
                    int i = this.i;
                    if (i == 0) {
                        str = getString(R.string.sharing_visibility_option_hidden);
                    } else if (i == 1 || i == 2) {
                        str = getString(R.string.sharing_visibility_option_contacts);
                    } else if (i == 3) {
                        str = getString(R.string.sharing_visibility_option_everyone);
                    } else if (i == 4) {
                        str = getString(R.string.sharing_visibility_option_self);
                    }
                }
                str = null;
            } else {
                str = getString(R.string.sharing_visibility_option_hidden);
            }
            qsTile.setSubtitle(str);
            qsTile.setContentDescription(z ? getString(R.string.sharing_tile_content_description_v3, new Object[]{str}) : getString(R.string.sharing_tile_content_description, new Object[]{str}));
        }
        if (this.g && this.h && g) {
            qsTile.setState(2);
        } else {
            qsTile.setState(1);
        }
        if (!auub.c()) {
            if (z) {
                f = ctuu.f(getResources().getDrawable(R.drawable.sharing_ic_v3_foreground));
            } else if (this.g && this.h && ctvb.g(this)) {
                f = ctuu.f(getResources().getDrawable(R.drawable.sharing_ic_tile));
                conm.a.d().p("Quick tile is displaying an enabled state.", new Object[0]);
            } else {
                f = ctuu.f(getResources().getDrawable(R.drawable.sharing_ic_tile_disabled));
                conm.a.d().p("Quick tile is displaying a disabled state.", new Object[0]);
            }
            if (!auub.c()) {
                state = qsTile.getState();
                if (state != 2) {
                    f.setTint(-16777216);
                } else {
                    f.setTint(-1);
                }
            }
            qsTile.setIcon(f);
        }
        qsTile.updateTile();
    }

    public final void c(String str) {
        Intent className = new Intent().addFlags(268435456).addFlags(32768).setClassName(this, str);
        if (ftgf.a.lK().y()) {
            className.setClassName(this, "com.google.android.gms.nearby.sharing.receive.ReceiveActivity");
            className.putExtra("enable_send_button_on_receive_ui", true);
        }
        if (ftdn.c()) {
            className.setClassName(this, "com.google.android.gms.nearby.sharing.main.MainActivity");
        }
        if (isLocked() || auub.f()) {
            startActivityAndCollapse(className);
            return;
        }
        try {
            int andIncrement = e.getAndIncrement();
            ClipData clipData = dyph.a;
            PendingIntent a = dyph.a(this, andIncrement, className, 201326592);
            ekvl.y(a);
            a.send();
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (PendingIntent.CanceledException e2) {
            conm.a.e().f(e2).h("SharingTileService failed to launch %s", str);
        }
    }

    public final void d(boolean z) {
        this.g = z;
        b(f());
    }

    public final void e(int i) {
        this.i = i;
        b(f());
    }

    public final boolean f() {
        return ftgf.d().isEmpty() && coog.a(this) == null;
    }

    @Override // com.google.android.chimera.TileService
    public final void onClick() {
        ftgi.m();
        final dhlw d2 = a().d();
        final dhma dhmaVar = new dhma();
        Callable callable = new Callable() { // from class: coiy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(((adny) SharingChimeraTileService.this.c.lK()).c());
            }
        };
        ExecutorService executorService = this.b;
        final eqgl m = eqgc.m(callable, executorService);
        m.hD(new Runnable() { // from class: coiz
            @Override // java.lang.Runnable
            public final void run() {
                int i = SharingChimeraTileService.d;
                dhma dhmaVar2 = dhma.this;
                try {
                    dhmaVar2.b((Boolean) ((eqcy) m).u());
                } catch (InterruptedException | ExecutionException e2) {
                    dhmaVar2.a(e2);
                }
            }
        }, executorService);
        dhlw d3 = dhmaVar.a.d(new dhkz() { // from class: cojc
            @Override // defpackage.dhkz
            public final Object a(dhlw dhlwVar) {
                int i = SharingChimeraTileService.d;
                if (!dhlwVar.m()) {
                    conm.a.c().p("Error retrieve FPR status, cannot open Nearby Share from quick settings", new Object[0]);
                    return dhmr.b();
                }
                dhlw dhlwVar2 = dhlw.this;
                if (!((Boolean) dhlwVar.i()).booleanValue()) {
                    return dhlwVar2;
                }
                conm.a.b().p("FRP on, ignoring quick settings click", new Object[0]);
                return dhmr.b();
            }
        });
        d3.z(new dhlq() { // from class: cojd
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                sharingChimeraTileService.c("com.google.android.gms.nearby.sharing.quicksettings.QuickSettingsActivity");
                sharingChimeraTileService.a.h(sharingChimeraTileService.getApplicationContext(), (Account) obj);
                colj coljVar = sharingChimeraTileService.a;
                fgrc L = colp.L(40);
                fann fannVar = fann.a;
                if (!L.b.L()) {
                    L.U();
                }
                fans fansVar = (fans) L.b;
                fans fansVar2 = fans.a;
                fannVar.getClass();
                fansVar.M = fannVar;
                fansVar.c |= 1024;
                coljVar.i(new coks((fans) L.Q()));
            }
        });
        d3.y(new dhln() { // from class: coje
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                if (ctvt.a(sharingChimeraTileService)) {
                    sharingChimeraTileService.c("com.google.android.gms.nearby.sharing.quicksettings.QuickSettingsActivity");
                } else {
                    sharingChimeraTileService.c("com.google.android.gms.nearby.sharing.receive.ReceiveActivity");
                }
                sharingChimeraTileService.a.h(sharingChimeraTileService.getApplicationContext(), null);
            }
        });
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.c = ekxd.a(new ekww() { // from class: coja
            @Override // defpackage.ekww
            public final Object lK() {
                return new adny(SharingChimeraTileService.this.getApplicationContext());
            }
        });
        this.a = colj.f(this);
        if (ftgi.m()) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
            this.j = anonymousClass1;
            chke.b(this, anonymousClass1, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
        }
        conm.a.b().p("SharingTileService created.", new Object[0]);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        BroadcastReceiver broadcastReceiver;
        super.onDestroy();
        if (ftgi.m() && (broadcastReceiver = this.j) != null) {
            chke.f(this, broadcastReceiver);
            this.j = null;
        }
        conm.a.b().p("SharingTileService destroyed", new Object[0]);
    }

    @Override // com.google.android.chimera.TileService
    public final void onStartListening() {
        b(f());
        a().i().z(new dhlq() { // from class: cojb
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                int i = ((DeviceVisibility) obj).f;
                boolean z = i != 0;
                SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                sharingChimeraTileService.d(z);
                sharingChimeraTileService.e(i);
            }
        });
        if (ftgi.m()) {
            return;
        }
        TracingBroadcastReceiver tracingBroadcastReceiver = new TracingBroadcastReceiver(this) { // from class: com.google.android.gms.nearby.sharing.SharingChimeraTileService.2
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context, Intent intent) {
                SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                sharingChimeraTileService.b(sharingChimeraTileService.f());
            }
        };
        this.j = tracingBroadcastReceiver;
        chke.b(this, tracingBroadcastReceiver, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
    }

    @Override // com.google.android.chimera.TileService
    public final void onStopListening() {
        BroadcastReceiver broadcastReceiver;
        if (ftgi.m() || (broadcastReceiver = this.j) == null) {
            return;
        }
        chke.f(this, broadcastReceiver);
        this.j = null;
    }

    @Override // com.google.android.chimera.TileService
    public final void onTileAdded() {
        colj coljVar = this.a;
        fgrc L = colp.L(37);
        falh falhVar = falh.a;
        if (!L.b.L()) {
            L.U();
        }
        fans fansVar = (fans) L.b;
        fans fansVar2 = fans.a;
        falhVar.getClass();
        fansVar.K = falhVar;
        fansVar.c |= 128;
        coljVar.i(new coks((fans) L.Q()));
    }

    @Override // com.google.android.chimera.TileService
    public final void onTileRemoved() {
        colj coljVar = this.a;
        fgrc L = colp.L(38);
        famr famrVar = famr.a;
        if (!L.b.L()) {
            L.U();
        }
        fans fansVar = (fans) L.b;
        fans fansVar2 = fans.a;
        famrVar.getClass();
        fansVar.L = famrVar;
        fansVar.c |= 256;
        coljVar.i(new coks((fans) L.Q()));
    }
}
