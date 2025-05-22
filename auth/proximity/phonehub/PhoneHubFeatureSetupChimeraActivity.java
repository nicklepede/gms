package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubFeatureSetupChimeraActivity;
import defpackage.aeqe;
import defpackage.aext;
import defpackage.aexw;
import defpackage.aeyv;
import defpackage.aeyw;
import defpackage.afas;
import defpackage.auad;
import defpackage.bp;
import defpackage.dg;
import defpackage.ew;
import defpackage.fnuf;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class PhoneHubFeatureSetupChimeraActivity extends rxx {
    public static final /* synthetic */ int p = 0;
    private static final auad q = new auad("ProximityAuth", "PhoneHubFeatureSetupChimeraActivity");
    public String j;
    public afas k;
    public afas l;
    public boolean m;
    public aeyw n;
    public aeqe o;
    private String r;
    private boolean s;
    private boolean t;

    public PhoneHubFeatureSetupChimeraActivity() {
        super(R.layout.phone_hub_feature_setup_activity);
        afas afasVar = afas.RESULT_NOT_ATTEMPTED;
        this.k = afasVar;
        this.l = afasVar;
        this.m = false;
    }

    private final void l() {
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.u(R.id.setup_card, new aexw(), "NotificationSetupFragment");
        bpVar.j = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        bpVar.a();
    }

    public final void a(boolean z) {
        if (z) {
            this.k = afas.RESULT_PERMISSION_GRANTED;
        } else {
            this.k = afas.RESULT_ERROR_USER_REJECT;
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
            bpVar.m(h);
            bpVar.j = FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
            bpVar.a();
        }
        this.l = afas.RESULT_IN_PROGRESS;
        l();
    }

    public final void k(boolean z) {
        if (!z) {
            a(false);
            this.o.F(2);
            return;
        }
        Intent b = fnuf.P() ? UpdateLocalFeatureStateIntentOperation.b(getApplicationContext(), this.r, true) : UpdateCameraRollAccessStateIntentOperation.a(getApplicationContext(), this.r, true);
        if (b != null) {
            startService(b);
            a(true);
            this.o.F(0);
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
        if (stringExtra2 == null && fnuf.w()) {
            q.m("No deviceId was provided in the Intent to PhoneHubFeatureSetupChimeraActivity", new Object[0]);
            finish();
            return;
        }
        this.j = stringExtra2;
        this.n = aeyw.a(this, this, new aeyv() { // from class: aexo
            @Override // defpackage.aeyv
            public final void a(boolean z) {
                PhoneHubFeatureSetupChimeraActivity.this.k(z);
            }
        });
        this.o = new aeqe();
        findViewById(R.id.setup_card).setOnClickListener(null);
        findViewById(R.id.background).setOnClickListener(new View.OnClickListener() { // from class: aexp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneHubFeatureSetupChimeraActivity.this.finish();
            }
        });
        if (bundle != null) {
            return;
        }
        if (this.s) {
            this.k = afas.RESULT_IN_PROGRESS;
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.u(R.id.setup_card, new aext(), "CameraRollSetupFragment");
            bpVar.j = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
            bpVar.a();
            return;
        }
        if (this.t) {
            this.l = afas.RESULT_IN_PROGRESS;
            l();
        } else {
            q.m("No feature was requested to be set up.", new Object[0]);
            finish();
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        if (fnuf.w()) {
            afas afasVar = this.k;
            afas afasVar2 = afas.RESULT_IN_PROGRESS;
            if (afasVar == afasVar2) {
                this.k = afas.RESULT_ERROR_ACTION_CANCELED;
                this.m = true;
            }
            if ((this.t && this.l == afas.RESULT_NOT_ATTEMPTED) || this.l == afasVar2) {
                this.m = true;
                this.l = afas.RESULT_ERROR_ACTION_CANCELED;
            }
        }
        if (fnuf.w()) {
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
