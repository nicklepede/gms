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
import defpackage.auid;
import defpackage.ausn;
import defpackage.bfze;
import defpackage.bfzr;
import defpackage.bgar;
import defpackage.bp;
import defpackage.caqj;
import defpackage.cjul;
import defpackage.edzp;
import defpackage.eluo;
import defpackage.fqti;
import defpackage.iuz;
import defpackage.ivv;
import defpackage.iwe;
import defpackage.iwv;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ProvisionChimeraActivity extends rxx implements bfze {
    public static final ausn j = ausn.b("ProvisionActivity", auid.FIND_MY_DEVICE_SPOT);
    public bfzr k;
    private boolean l;
    private boolean m;
    private boolean n = false;
    private Handler o;

    private final void k(boolean z) {
        ausn ausnVar = j;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 4119)).B("Exiting flow, provisioned: %b", Boolean.valueOf(z));
        if (this.m) {
            if (z) {
                z = true;
            }
            finish();
        }
        if (!this.l) {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 4120)).x("Sending the response to Fast Pair");
            this.l = true;
            bfzr bfzrVar = this.k;
            startActivity(new Intent().setClassName(this, "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity").addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).putExtras(bfzrVar.c).putExtra("com.google.android.gms.nearby.discovery.HALF_SHEET", bfzrVar.b.r()).putExtra("com.google.android.gms.fastpair.spot_provisioned", z));
            this.n = true;
            this.o.postDelayed(new Runnable() { // from class: bfzg
                @Override // java.lang.Runnable
                public final void run() {
                    ProvisionChimeraActivity.this.finish();
                }
            }, fqti.a.lK().c());
            return;
        }
        finish();
    }

    @Override // defpackage.bfze
    public final void a() {
        k(true);
    }

    @Override // defpackage.bfze
    public final void b() {
        if (this.n) {
            return;
        }
        k(false);
    }

    @Override // defpackage.bfze
    public final void c(boolean z, final boolean z2) {
        ((eluo) ((eluo) j.h()).ai(4123)).S("enable dismiss: %b, should resume: %b", z, z2);
        this.m = z2;
        View findViewById = findViewById(R.id.background);
        if (z) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: bfzj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProvisionChimeraActivity provisionChimeraActivity = ProvisionChimeraActivity.this;
                    if (!z2) {
                        provisionChimeraActivity.k.ag.a(dzjn.DISMISSED);
                    }
                    provisionChimeraActivity.b();
                }
            });
        } else {
            findViewById.setOnClickListener(null);
        }
        findViewById.setClickable(z);
    }

    @Override // defpackage.bfze
    public final void d() {
        ((eluo) ((eluo) j.h()).ai((char) 4124)).x("Start dismiss dialog");
        cjul cjulVar = this.k.b;
        edzp edzpVar = new edzp(this);
        edzpVar.M(R.string.provision_leave_dialog_title);
        edzpVar.C(getResources().getString(R.string.provision_leave_dialog_content, cjulVar.i));
        edzpVar.K(R.string.provision_leave_dialog_leave_button, new DialogInterface.OnClickListener() { // from class: bfzh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ProvisionChimeraActivity provisionChimeraActivity = ProvisionChimeraActivity.this;
                provisionChimeraActivity.k.ag.a(dzjn.DISMISSED);
                provisionChimeraActivity.b();
            }
        });
        edzpVar.E(R.string.provision_leave_dialog_continue_setup_button, new DialogInterface.OnClickListener() { // from class: bfzi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ausn ausnVar = ProvisionChimeraActivity.j;
                dialogInterface.dismiss();
            }
        });
        edzpVar.create().show();
    }

    @Override // defpackage.bfze
    public final void e(Intent intent) {
        ((eluo) ((eluo) j.h()).ai((char) 4125)).B("Starting activity: %s", intent.getAction());
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((eluo) ((eluo) ((eluo) j.j()).s(e)).ai((char) 4126)).B("Failed to start activity: %s", intent.getAction());
        }
    }

    @Override // defpackage.bfze
    public final void f(String str) {
        e(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((eluo) ((eluo) j.h()).ai((char) 4121)).x("onCreate");
        this.o = new caqj(Looper.getMainLooper());
        iwv.a(getWindow(), false);
        View decorView = getWindow().getDecorView();
        iuz iuzVar = new iuz() { // from class: bfzf
            @Override // defpackage.iuz
            public final ixt eB(View view, ixt ixtVar) {
                int i = ixtVar.f(2).e;
                View findViewById = ProvisionChimeraActivity.this.findViewById(R.id.card);
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i);
                return ixt.a;
            }
        };
        int[] iArr = iwe.a;
        ivv.k(decorView, iuzVar);
        setContentView(R.layout.provision_half_sheet);
        this.l = false;
        bfzr bfzrVar = new bfzr();
        this.k = bfzrVar;
        bfzrVar.setArguments(getIntent().getExtras());
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fragment_container, this.k);
        bpVar.a();
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        this.o.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        bgar.b = false;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        bgar.b = true;
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStop() {
        if (isFinishing()) {
            b();
        }
        super.onStop();
    }
}
