package com.google.android.gms.findmydevice.spot.fastpair.halfsheet;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.findmydevice.spot.fastpair.halfsheet.ProvisionChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asej;
import defpackage.asot;
import defpackage.bdxs;
import defpackage.bdyf;
import defpackage.bdzf;
import defpackage.bp;
import defpackage.byhr;
import defpackage.chmk;
import defpackage.ebna;
import defpackage.ejhf;
import defpackage.fobo;
import defpackage.itj;
import defpackage.iuf;
import defpackage.iuo;
import defpackage.ivf;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ProvisionChimeraActivity extends qet implements bdxs {
    public static final asot j = asot.b("ProvisionActivity", asej.FIND_MY_DEVICE_SPOT);
    public bdyf k;
    private boolean l;
    private boolean m;
    private boolean n = false;
    private Handler o;

    private final void k(boolean z) {
        asot asotVar = j;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 4113)).B("Exiting flow, provisioned: %b", Boolean.valueOf(z));
        if (this.m) {
            if (z) {
                z = true;
            }
            finish();
        }
        if (!this.l) {
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 4114)).x("Sending the response to Fast Pair");
            this.l = true;
            bdyf bdyfVar = this.k;
            startActivity(new Intent().setClassName(this, "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity").addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).putExtras(bdyfVar.c).putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET", bdyfVar.b.r()).putExtra("com.google.android.gms.fastpair.spot_provisioned", z));
            this.n = true;
            this.o.postDelayed(new Runnable() { // from class: bdxu
                @Override // java.lang.Runnable
                public final void run() {
                    ProvisionChimeraActivity.this.finish();
                }
            }, fobo.a.a().c());
            return;
        }
        finish();
    }

    @Override // defpackage.bdxs
    public final void a() {
        k(true);
    }

    @Override // defpackage.bdxs
    public final void b() {
        if (this.n) {
            return;
        }
        k(false);
    }

    @Override // defpackage.bdxs
    public final void c(boolean z, final boolean z2) {
        ((ejhf) ((ejhf) j.h()).ah(4117)).S("enable dismiss: %b, should resume: %b", z, z2);
        this.m = z2;
        View findViewById = findViewById(R.id.background);
        if (z) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: bdxx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProvisionChimeraActivity provisionChimeraActivity = ProvisionChimeraActivity.this;
                    if (!z2) {
                        provisionChimeraActivity.k.ag.a(dwxn.DISMISSED);
                    }
                    provisionChimeraActivity.b();
                }
            });
        } else {
            findViewById.setOnClickListener(null);
        }
        findViewById.setClickable(z);
    }

    @Override // defpackage.bdxs
    public final void d() {
        ((ejhf) ((ejhf) j.h()).ah((char) 4118)).x("Start dismiss dialog");
        chmk chmkVar = this.k.b;
        ebna ebnaVar = new ebna(this);
        ebnaVar.M(R.string.provision_leave_dialog_title);
        ebnaVar.C(getResources().getString(R.string.provision_leave_dialog_content, chmkVar.i));
        ebnaVar.K(R.string.provision_leave_dialog_leave_button, new DialogInterface.OnClickListener() { // from class: bdxv
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ProvisionChimeraActivity provisionChimeraActivity = ProvisionChimeraActivity.this;
                provisionChimeraActivity.k.ag.a(dwxn.DISMISSED);
                provisionChimeraActivity.b();
            }
        });
        ebnaVar.E(R.string.provision_leave_dialog_continue_setup_button, new DialogInterface.OnClickListener() { // from class: bdxw
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                asot asotVar = ProvisionChimeraActivity.j;
                dialogInterface.dismiss();
            }
        });
        ebnaVar.create().show();
    }

    @Override // defpackage.bdxs
    public final void e(Intent intent) {
        ((ejhf) ((ejhf) j.h()).ah((char) 4119)).B("Starting activity: %s", intent.getAction());
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((ejhf) ((ejhf) ((ejhf) j.j()).s(e)).ah((char) 4120)).B("Failed to start activity: %s", intent.getAction());
        }
    }

    @Override // defpackage.bdxs
    public final void f(String str) {
        e(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ejhf) ((ejhf) j.h()).ah((char) 4115)).x("onCreate");
        this.o = new byhr(Looper.getMainLooper());
        ivf.a(getWindow(), false);
        View decorView = getWindow().getDecorView();
        itj itjVar = new itj() { // from class: bdxt
            @Override // defpackage.itj
            public final iwd eB(View view, iwd iwdVar) {
                int i = iwdVar.f(2).e;
                View findViewById = ProvisionChimeraActivity.this.findViewById(R.id.card);
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i);
                return iwd.a;
            }
        };
        int[] iArr = iuo.a;
        iuf.k(decorView, itjVar);
        setContentView(R.layout.provision_half_sheet);
        this.l = false;
        bdyf bdyfVar = new bdyf();
        this.k = bdyfVar;
        bdyfVar.setArguments(getIntent().getExtras());
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fragment_container, this.k);
        bpVar.a();
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        this.o.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        bdzf.b = false;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        bdzf.b = true;
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStop() {
        if (isFinishing()) {
            b();
        }
        super.onStop();
    }
}
