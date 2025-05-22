package com.google.android.gms.quickstart.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.quickstart.oem.OemAppInstallChimeraActivity;
import defpackage.atzb;
import defpackage.auad;
import defpackage.bp;
import defpackage.czhx;
import defpackage.czhy;
import defpackage.czia;
import defpackage.czik;
import defpackage.czil;
import defpackage.dg;
import defpackage.eqgl;
import defpackage.fukq;
import defpackage.iic;
import defpackage.iif;
import defpackage.ip;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import j$.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OemAppInstallChimeraActivity extends rxx {
    public static final auad j = new auad("QuickStart", "OemAppInstallActivity");
    public czil l;
    public eqgl n;
    public BroadcastReceiver o;
    private int p;
    public String k = "";
    public long m = 0;

    public static void m(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            j.m("Failed to unregister BroadcastReceiver, it was null", new Object[0]);
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
            j.h("BroadcastReceiver unregistered", new Object[0]);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            j.m("Failed to unregister BroadcastReceiver, it was probably already unregistered", new Object[0]);
        }
    }

    public final void a(int i) {
        setResult(i);
        finishAndRemoveTask();
    }

    public final void k() {
        String str = this.k;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=".concat(String.valueOf(str))));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", "com.google.android.gms");
        startActivityForResult(intent, 460);
    }

    public final void l(int i) {
        dg cziaVar;
        this.p = i;
        if (i == 0) {
            k();
            cziaVar = new czhy();
        } else {
            finishActivity(460);
            cziaVar = new czia();
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.A(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
        bpVar.F(R.id.fragment_container, cziaVar);
        bpVar.a();
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onActivityResult(int i, int i2, Intent intent) {
        auad auadVar = j;
        Integer valueOf = Integer.valueOf(i);
        auadVar.h("onActivityResult(): request=%d, result=%d", valueOf, Integer.valueOf(i2));
        if (i != 460) {
            auadVar.m("Unknown activity request code: %d", valueOf);
            super.onActivityResult(i, i2, intent);
        } else if (this.p == 0) {
            ip ipVar = new ip(this);
            ipVar.l(R.string.quickstart_qr_code_scanner_exit_title);
            ipVar.setPositiveButton(R.string.common_ok, new DialogInterface.OnClickListener() { // from class: czie
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    OemAppInstallChimeraActivity.this.a(5010);
                }
            });
            ipVar.setNegativeButton(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: czif
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    OemAppInstallChimeraActivity.this.k();
                }
            });
            ipVar.c(false);
            ipVar.a();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        czhx.a(this);
        setContentView(R.layout.quickstart_fragment_container);
        String stringExtra = getIntent().getStringExtra("package-name");
        if (stringExtra != null) {
            this.k = stringExtra;
        }
        czil czilVar = (czil) new jxw(this, new czik(getApplication(), this.k)).a(czil.class);
        this.l = czilVar;
        czilVar.b().g(this, new jvs() { // from class: czib
            @Override // defpackage.jvs
            public final void a(Object obj) {
                int i = ((czih) obj).a;
                final OemAppInstallChimeraActivity oemAppInstallChimeraActivity = OemAppInstallChimeraActivity.this;
                if (i == 1) {
                    OemAppInstallChimeraActivity.j.h("There are %d sessions in the install queue", Integer.valueOf(oemAppInstallChimeraActivity.l.c().size()));
                    oemAppInstallChimeraActivity.l(1);
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        ip ipVar = new ip(oemAppInstallChimeraActivity);
                        ipVar.l(R.string.common_something_went_wrong);
                        ipVar.o(R.string.quickstart_oem_restore_app_install_failed);
                        ipVar.setPositiveButton(R.string.common_ok, new DialogInterface.OnClickListener() { // from class: czid
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                OemAppInstallChimeraActivity.this.a(5011);
                            }
                        });
                        ipVar.c(false);
                        ipVar.a();
                        return;
                    }
                    if (oemAppInstallChimeraActivity.m <= 0) {
                        oemAppInstallChimeraActivity.a(-1);
                    } else if (oemAppInstallChimeraActivity.n == null) {
                        OemAppInstallChimeraActivity.j.m("Package broadcast future is null, returning OK", new Object[0]);
                        oemAppInstallChimeraActivity.a(-1);
                    } else {
                        OemAppInstallChimeraActivity.j.h("Waiting for PACKAGE_ADDED broadcast before finishing...", new Object[0]);
                        eqgc.t(eqgc.q(oemAppInstallChimeraActivity.n, oemAppInstallChimeraActivity.m, TimeUnit.MILLISECONDS, Executors.newSingleThreadScheduledExecutor()), new czig(oemAppInstallChimeraActivity), eqex.a);
                    }
                }
            }
        });
        l(0);
        long a = fukq.a.lK().a();
        this.m = a;
        if (a > 0) {
            this.n = iif.a(new iic() { // from class: czic
                @Override // defpackage.iic
                public final Object a(final iia iiaVar) {
                    final OemAppInstallChimeraActivity oemAppInstallChimeraActivity = OemAppInstallChimeraActivity.this;
                    oemAppInstallChimeraActivity.o = new TracingBroadcastReceiver() { // from class: com.google.android.gms.quickstart.oem.OemAppInstallChimeraActivity.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super("quickstart");
                        }

                        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                        public final void jP(Context context, Intent intent) {
                            String str;
                            if (Objects.equals(intent.getAction(), "android.intent.action.PACKAGE_ADDED")) {
                                if (intent.getData() != null) {
                                    Uri data = intent.getData();
                                    atzb.s(data);
                                    str = data.getSchemeSpecificPart();
                                } else {
                                    str = null;
                                }
                                OemAppInstallChimeraActivity.j.h("Received PACKAGE_ADDED broadcast for %s", String.valueOf(str));
                                OemAppInstallChimeraActivity oemAppInstallChimeraActivity2 = oemAppInstallChimeraActivity;
                                if (oemAppInstallChimeraActivity2.k.equals(str)) {
                                    iiaVar.b(null);
                                    OemAppInstallChimeraActivity.m(oemAppInstallChimeraActivity2, oemAppInstallChimeraActivity2.o);
                                }
                            }
                        }
                    };
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    ind.b(oemAppInstallChimeraActivity, oemAppInstallChimeraActivity.o, intentFilter, 2);
                    OemAppInstallChimeraActivity.j.h("Registered BroadcastReceiver for PACKAGE_ADDED broadcasts for %s", oemAppInstallChimeraActivity.k);
                    return "quickstart package receiver";
                }
            });
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.o;
        if (broadcastReceiver != null) {
            m(this, broadcastReceiver);
        }
    }
}
