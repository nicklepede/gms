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
import defpackage.arwm;
import defpackage.arxo;
import defpackage.bp;
import defpackage.cwxz;
import defpackage.cwya;
import defpackage.cwyc;
import defpackage.cwym;
import defpackage.cwyn;
import defpackage.dg;
import defpackage.enss;
import defpackage.frqi;
import defpackage.igm;
import defpackage.igp;
import defpackage.ip;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import j$.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OemAppInstallChimeraActivity extends qet {
    public static final arxo j = new arxo("QuickStart", "OemAppInstallActivity");
    public cwyn l;
    public enss n;
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
        dg cwycVar;
        this.p = i;
        if (i == 0) {
            k();
            cwycVar = new cwya();
        } else {
            finishActivity(460);
            cwycVar = new cwyc();
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.A(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
        bpVar.F(R.id.fragment_container, cwycVar);
        bpVar.a();
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onActivityResult(int i, int i2, Intent intent) {
        arxo arxoVar = j;
        Integer valueOf = Integer.valueOf(i);
        arxoVar.h("onActivityResult(): request=%d, result=%d", valueOf, Integer.valueOf(i2));
        if (i != 460) {
            arxoVar.m("Unknown activity request code: %d", valueOf);
            super.onActivityResult(i, i2, intent);
        } else if (this.p == 0) {
            ip ipVar = new ip(this);
            ipVar.j(R.string.quickstart_qr_code_scanner_exit_title);
            ipVar.setPositiveButton(R.string.common_ok, new DialogInterface.OnClickListener() { // from class: cwyg
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    OemAppInstallChimeraActivity.this.a(5010);
                }
            });
            ipVar.setNegativeButton(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: cwyh
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    OemAppInstallChimeraActivity.this.k();
                }
            });
            ipVar.c(false);
            ipVar.a();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cwxz.a(this);
        setContentView(R.layout.quickstart_fragment_container);
        String stringExtra = getIntent().getStringExtra("package-name");
        if (stringExtra != null) {
            this.k = stringExtra;
        }
        cwyn cwynVar = (cwyn) new jrh(this, new cwym(getApplication(), this.k)).a(cwyn.class);
        this.l = cwynVar;
        cwynVar.b().g(this, new jpd() { // from class: cwyd
            @Override // defpackage.jpd
            public final void a(Object obj) {
                int i = ((cwyj) obj).a;
                final OemAppInstallChimeraActivity oemAppInstallChimeraActivity = OemAppInstallChimeraActivity.this;
                if (i == 1) {
                    OemAppInstallChimeraActivity.j.h("There are %d sessions in the install queue", Integer.valueOf(oemAppInstallChimeraActivity.l.c().size()));
                    oemAppInstallChimeraActivity.l(1);
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        ip ipVar = new ip(oemAppInstallChimeraActivity);
                        ipVar.j(R.string.common_something_went_wrong);
                        ipVar.m(R.string.quickstart_oem_restore_app_install_failed);
                        ipVar.setPositiveButton(R.string.common_ok, new DialogInterface.OnClickListener() { // from class: cwyf
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
                        ensj.t(ensj.q(oemAppInstallChimeraActivity.n, oemAppInstallChimeraActivity.m, TimeUnit.MILLISECONDS, Executors.newSingleThreadScheduledExecutor()), new cwyi(oemAppInstallChimeraActivity), enre.a);
                    }
                }
            }
        });
        l(0);
        long a = frqi.a.a().a();
        this.m = a;
        if (a > 0) {
            this.n = igp.a(new igm() { // from class: cwye
                @Override // defpackage.igm
                public final Object a(final igk igkVar) {
                    final OemAppInstallChimeraActivity oemAppInstallChimeraActivity = OemAppInstallChimeraActivity.this;
                    oemAppInstallChimeraActivity.o = new TracingBroadcastReceiver() { // from class: com.google.android.gms.quickstart.oem.OemAppInstallChimeraActivity.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super("quickstart");
                        }

                        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                        public final void jz(Context context, Intent intent) {
                            String str;
                            if (Objects.equals(intent.getAction(), "android.intent.action.PACKAGE_ADDED")) {
                                if (intent.getData() != null) {
                                    Uri data = intent.getData();
                                    arwm.s(data);
                                    str = data.getSchemeSpecificPart();
                                } else {
                                    str = null;
                                }
                                OemAppInstallChimeraActivity.j.h("Received PACKAGE_ADDED broadcast for %s", String.valueOf(str));
                                OemAppInstallChimeraActivity oemAppInstallChimeraActivity2 = oemAppInstallChimeraActivity;
                                if (oemAppInstallChimeraActivity2.k.equals(str)) {
                                    igkVar.b(null);
                                    OemAppInstallChimeraActivity.m(oemAppInstallChimeraActivity2, oemAppInstallChimeraActivity2.o);
                                }
                            }
                        }
                    };
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    iln.b(oemAppInstallChimeraActivity, oemAppInstallChimeraActivity.o, intentFilter, 2);
                    OemAppInstallChimeraActivity.j.h("Registered BroadcastReceiver for PACKAGE_ADDED broadcasts for %s", oemAppInstallChimeraActivity.k);
                    return "quickstart package receiver";
                }
            });
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.o;
        if (broadcastReceiver != null) {
            m(this, broadcastReceiver);
        }
    }
}
