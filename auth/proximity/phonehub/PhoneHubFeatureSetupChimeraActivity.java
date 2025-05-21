package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubFeatureSetupChimeraActivity;
import defpackage.acqe;
import defpackage.acxt;
import defpackage.acxw;
import defpackage.acyv;
import defpackage.acyw;
import defpackage.adas;
import defpackage.arxo;
import defpackage.bp;
import defpackage.dg;
import defpackage.ew;
import defpackage.flcw;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class PhoneHubFeatureSetupChimeraActivity extends qet {
    public static final /* synthetic */ int p = 0;
    private static final arxo q = new arxo("ProximityAuth", "PhoneHubFeatureSetupChimeraActivity");
    public String j;
    public adas k;
    public adas l;
    public boolean m;
    public acyw n;
    public acqe o;
    private String r;
    private boolean s;
    private boolean t;

    public PhoneHubFeatureSetupChimeraActivity() {
        super(R.layout.phone_hub_feature_setup_activity);
        adas adasVar = adas.RESULT_NOT_ATTEMPTED;
        this.k = adasVar;
        this.l = adasVar;
        this.m = false;
    }

    private final void l() {
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.u(R.id.setup_card, new acxw(), "NotificationSetupFragment");
        bpVar.j = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        bpVar.a();
    }

    public final void a(boolean z) {
        if (z) {
            this.k = adas.RESULT_PERMISSION_GRANTED;
        } else {
            this.k = adas.RESULT_ERROR_USER_REJECT;
        }
        if (!this.t) {
            this.m = true;
            finish();
            return;
        }
        ew supportFragmentManager = getSupportFragmentManager();
        dg h = supportFragmentManager.h("CameraRollSetupFragment");
        if (h != null) {
            bp bpVar = new bp(supportFragmentManager);
            bpVar.n(h);
            bpVar.j = FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
            bpVar.a();
        }
        this.l = adas.RESULT_IN_PROGRESS;
        l();
    }

    public final void k(boolean z) {
        if (!z) {
            a(false);
            this.o.F(2);
            return;
        }
        Intent b = flcw.P() ? UpdateLocalFeatureStateIntentOperation.b(getApplicationContext(), this.r, true) : UpdateCameraRollAccessStateIntentOperation.a(getApplicationContext(), this.r, true);
        if (b != null) {
            startService(b);
            a(true);
            this.o.F(0);
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("accountName");
        if (stringExtra == null) {
            q.m("No accountName was provided in the Intent to PhoneHubFeatureSetupChimeraActivity", new Object[0]);
            finish();
            return;
        }
        this.r = stringExtra;
        this.s = intent.getBooleanExtra("cameraRollSetupRequested", false);
        this.t = intent.getBooleanExtra("notificationSetupRequested", false);
        String stringExtra2 = intent.getStringExtra("deviceId");
        if (stringExtra2 == null && flcw.w()) {
            q.m("No deviceId was provided in the Intent to PhoneHubFeatureSetupChimeraActivity", new Object[0]);
            finish();
            return;
        }
        this.j = stringExtra2;
        this.n = acyw.a(this, this, new acyv() { // from class: acxo
            @Override // defpackage.acyv
            public final void a(boolean z) {
                PhoneHubFeatureSetupChimeraActivity.this.k(z);
            }
        });
        this.o = new acqe();
        findViewById(R.id.setup_card).setOnClickListener(null);
        findViewById(R.id.background).setOnClickListener(new View.OnClickListener() { // from class: acxp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneHubFeatureSetupChimeraActivity.this.finish();
            }
        });
        if (bundle != null) {
            return;
        }
        if (this.s) {
            this.k = adas.RESULT_IN_PROGRESS;
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.u(R.id.setup_card, new acxt(), "CameraRollSetupFragment");
            bpVar.j = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
            bpVar.a();
            return;
        }
        if (this.t) {
            this.l = adas.RESULT_IN_PROGRESS;
            l();
        } else {
            q.m("No feature was requested to be set up.", new Object[0]);
            finish();
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        if (flcw.w()) {
            adas adasVar = this.k;
            adas adasVar2 = adas.RESULT_IN_PROGRESS;
            if (adasVar == adasVar2) {
                this.k = adas.RESULT_ERROR_ACTION_CANCELED;
                this.m = true;
            }
            if ((this.t && this.l == adas.RESULT_NOT_ATTEMPTED) || this.l == adasVar2) {
                this.m = true;
                this.l = adas.RESULT_ERROR_ACTION_CANCELED;
            }
        }
        if (flcw.w()) {
            Context applicationContext = getApplicationContext();
            String str = this.r;
            int a = this.k.a();
            int a2 = this.l.a();
            String str2 = this.j;
            boolean z = this.m;
            int i = PhoneHubUpdateSetupResultIntentOperation.a;
            Intent startIntent = IntentOperation.getStartIntent(applicationContext, PhoneHubUpdateSetupResultIntentOperation.class, "com.google.android.gms.auth.proximity.phonehub.ACTION_UPDATE_PHONEHUB_SETUP_RESULT");
            Intent putExtras = startIntent == null ? null : startIntent.putExtras(PhoneHubUpdateSetupResultIntentOperation.a(str, a, a2, str2, z, null));
            if (putExtras != null) {
                startService(putExtras);
            }
        }
        super.onDestroy();
    }
}
