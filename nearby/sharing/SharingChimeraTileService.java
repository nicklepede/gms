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
import defpackage.asmf;
import defpackage.asqh;
import defpackage.cewl;
import defpackage.cfcs;
import defpackage.cmaz;
import defpackage.cmck;
import defpackage.cmdb;
import defpackage.cmdh;
import defpackage.cmfe;
import defpackage.cmfy;
import defpackage.crlp;
import defpackage.crlw;
import defpackage.dezt;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.dfau;
import defpackage.dwdg;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ensj;
import defpackage.enss;
import defpackage.exft;
import defpackage.exwv;
import defpackage.exyf;
import defpackage.exzg;
import defpackage.fecj;
import defpackage.fqjv;
import defpackage.fqmk;
import defpackage.fqmn;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SharingChimeraTileService extends TileService {
    public static final /* synthetic */ int d = 0;
    private static final AtomicInteger e = new AtomicInteger(new SecureRandom().nextInt());
    public cmdb a;
    public eijr c;
    private cmaz f;
    private boolean g;
    private boolean h;
    private int i = -1;
    final ExecutorService b = new asmf(1, 9);
    private BroadcastReceiver j = null;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.nearby.sharing.SharingChimeraTileService$1, reason: invalid class name */
    public class AnonymousClass1 extends TracingBroadcastReceiver {
        public AnonymousClass1(Context context) {
            super(context);
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            cmfe.a.b().p("Invalidate tile state due to state change.", new Object[0]);
            SharingChimeraTileService.this.a().i().z(new dfak() { // from class: cmax
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    int i = ((DeviceVisibility) obj).f;
                    boolean z = i != 0;
                    SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                    sharingChimeraTileService.d(z);
                    sharingChimeraTileService.e(i);
                }
            });
        }
    }

    public final cmaz a() {
        if (this.f == null) {
            this.f = cewl.e(this);
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
            cmfe.a.b().p("Failed to invalidate tile state.", new Object[0]);
            return;
        }
        this.h = exft.b(this);
        if (z) {
            qsTile.setLabel(getResources().getString(R.string.sharing_product_name_v3));
        } else {
            qsTile.setLabel(getResources().getString(R.string.sharing_product_name));
        }
        boolean g = crlw.g(this);
        if (asqh.f()) {
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
        if (!asqh.c()) {
            if (z) {
                f = crlp.f(getResources().getDrawable(R.drawable.sharing_ic_v3_foreground));
            } else if (this.g && this.h && crlw.g(this)) {
                f = crlp.f(getResources().getDrawable(R.drawable.sharing_ic_tile));
                cmfe.a.d().p("Quick tile is displaying an enabled state.", new Object[0]);
            } else {
                f = crlp.f(getResources().getDrawable(R.drawable.sharing_ic_tile_disabled));
                cmfe.a.d().p("Quick tile is displaying a disabled state.", new Object[0]);
            }
            if (!asqh.c()) {
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
        if (fqmk.a.a().y()) {
            className.setClassName(this, "com.google.android.gms.nearby.sharing.receive.ReceiveActivity");
            className.putExtra("enable_send_button_on_receive_ui", true);
        }
        if (fqjv.c()) {
            className.setClassName(this, "com.google.android.gms.nearby.sharing.main.MainActivity");
        }
        if (isLocked() || asqh.f()) {
            startActivityAndCollapse(className);
            return;
        }
        try {
            int andIncrement = e.getAndIncrement();
            ClipData clipData = dwdg.a;
            PendingIntent a = dwdg.a(this, andIncrement, className, 201326592);
            eiig.x(a);
            a.send();
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (PendingIntent.CanceledException e2) {
            cmfe.a.e().f(e2).h("SharingTileService failed to launch %s", str);
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
        return fqmk.d().isEmpty() && cmfy.a(this) == null;
    }

    @Override // com.google.android.chimera.TileService
    public final void onClick() {
        fqmn.m();
        final dfaq d2 = a().d();
        final dfau dfauVar = new dfau();
        Callable callable = new Callable() { // from class: cmaq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(((abny) SharingChimeraTileService.this.c.a()).c());
            }
        };
        ExecutorService executorService = this.b;
        final enss m = ensj.m(callable, executorService);
        m.hn(new Runnable() { // from class: cmar
            @Override // java.lang.Runnable
            public final void run() {
                int i = SharingChimeraTileService.d;
                dfau dfauVar2 = dfau.this;
                try {
                    dfauVar2.b((Boolean) ((enpf) m).u());
                } catch (InterruptedException | ExecutionException e2) {
                    dfauVar2.a(e2);
                }
            }
        }, executorService);
        dfaq d3 = dfauVar.a.d(new dezt() { // from class: cmau
            @Override // defpackage.dezt
            public final Object a(dfaq dfaqVar) {
                int i = SharingChimeraTileService.d;
                if (!dfaqVar.m()) {
                    cmfe.a.c().p("Error retrieve FPR status, cannot open Nearby Share from quick settings", new Object[0]);
                    return dfbl.b();
                }
                dfaq dfaqVar2 = dfaq.this;
                if (!((Boolean) dfaqVar.i()).booleanValue()) {
                    return dfaqVar2;
                }
                cmfe.a.b().p("FRP on, ignoring quick settings click", new Object[0]);
                return dfbl.b();
            }
        });
        d3.z(new dfak() { // from class: cmav
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                sharingChimeraTileService.c("com.google.android.gms.nearby.sharing.quicksettings.QuickSettingsActivity");
                sharingChimeraTileService.a.h(sharingChimeraTileService.getApplicationContext(), (Account) obj);
                cmdb cmdbVar = sharingChimeraTileService.a;
                fecj L = cmdh.L(40);
                exzb exzbVar = exzb.a;
                if (!L.b.L()) {
                    L.U();
                }
                exzg exzgVar = (exzg) L.b;
                exzg exzgVar2 = exzg.a;
                exzbVar.getClass();
                exzgVar.M = exzbVar;
                exzgVar.c |= 1024;
                cmdbVar.i(new cmck((exzg) L.Q()));
            }
        });
        d3.y(new dfah() { // from class: cmaw
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                if (crmo.a(sharingChimeraTileService)) {
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
        this.c = eijy.a(new eijr() { // from class: cmas
            @Override // defpackage.eijr
            public final Object a() {
                return new abny(SharingChimeraTileService.this.getApplicationContext());
            }
        });
        this.a = cmdb.f(this);
        if (fqmn.m()) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
            this.j = anonymousClass1;
            cfcs.b(this, anonymousClass1, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
        }
        cmfe.a.b().p("SharingTileService created.", new Object[0]);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        BroadcastReceiver broadcastReceiver;
        super.onDestroy();
        if (fqmn.m() && (broadcastReceiver = this.j) != null) {
            cfcs.f(this, broadcastReceiver);
            this.j = null;
        }
        cmfe.a.b().p("SharingTileService destroyed", new Object[0]);
    }

    @Override // com.google.android.chimera.TileService
    public final void onStartListening() {
        b(f());
        a().i().z(new dfak() { // from class: cmat
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                int i = ((DeviceVisibility) obj).f;
                boolean z = i != 0;
                SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                sharingChimeraTileService.d(z);
                sharingChimeraTileService.e(i);
            }
        });
        if (fqmn.m()) {
            return;
        }
        TracingBroadcastReceiver tracingBroadcastReceiver = new TracingBroadcastReceiver(this) { // from class: com.google.android.gms.nearby.sharing.SharingChimeraTileService.2
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context, Intent intent) {
                SharingChimeraTileService sharingChimeraTileService = SharingChimeraTileService.this;
                sharingChimeraTileService.b(sharingChimeraTileService.f());
            }
        };
        this.j = tracingBroadcastReceiver;
        cfcs.b(this, tracingBroadcastReceiver, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
    }

    @Override // com.google.android.chimera.TileService
    public final void onStopListening() {
        BroadcastReceiver broadcastReceiver;
        if (fqmn.m() || (broadcastReceiver = this.j) == null) {
            return;
        }
        cfcs.f(this, broadcastReceiver);
        this.j = null;
    }

    @Override // com.google.android.chimera.TileService
    public final void onTileAdded() {
        cmdb cmdbVar = this.a;
        fecj L = cmdh.L(37);
        exwv exwvVar = exwv.a;
        if (!L.b.L()) {
            L.U();
        }
        exzg exzgVar = (exzg) L.b;
        exzg exzgVar2 = exzg.a;
        exwvVar.getClass();
        exzgVar.K = exwvVar;
        exzgVar.c |= 128;
        cmdbVar.i(new cmck((exzg) L.Q()));
    }

    @Override // com.google.android.chimera.TileService
    public final void onTileRemoved() {
        cmdb cmdbVar = this.a;
        fecj L = cmdh.L(38);
        exyf exyfVar = exyf.a;
        if (!L.b.L()) {
            L.U();
        }
        exzg exzgVar = (exzg) L.b;
        exzg exzgVar2 = exzg.a;
        exyfVar.getClass();
        exzgVar.L = exyfVar;
        exzgVar.c |= 256;
        cmdbVar.i(new cmck((exzg) L.Q()));
    }
}
