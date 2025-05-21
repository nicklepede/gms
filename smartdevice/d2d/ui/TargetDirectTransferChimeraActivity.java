package com.google.android.gms.smartdevice.d2d.ui;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import defpackage.a;
import defpackage.arjz;
import defpackage.arkc;
import defpackage.ddod;
import defpackage.ddoq;
import defpackage.ddqr;
import defpackage.dego;
import defpackage.degp;
import defpackage.degq;
import defpackage.dg;
import defpackage.fkhl;
import defpackage.qex;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TargetDirectTransferChimeraActivity extends qex implements degp, ddqr {
    public static final /* synthetic */ int h = 0;
    private ResultReceiver i;
    private ProxyResultReceiver j;
    private ddod k;

    @Override // defpackage.degp
    public final void o(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("dependencyErrorCode", i);
        this.i.send(2005, bundle);
        finishAndRemoveTask();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        this.i.send(2004, Bundle.EMPTY);
        finishAndRemoveTask();
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dg g = gI().g(R.id.fragment_container);
        if (g instanceof degq) {
            ((degq) g).y();
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fkhl.c()) {
            arjz.a(this);
        }
        arkc.g(this);
        setContentView(R.layout.smartdevice_fragment_container);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("resultReceiver");
        if (resultReceiver == null) {
            finish();
            return;
        }
        this.i = resultReceiver;
        if (bundle == null) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("extraAccountChallengeData");
            if (parcelableArrayListExtra == null) {
                finish();
                return;
            }
            Bundle a = dego.a(parcelableArrayListExtra, "", null, null, R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24, true, getIntent().getBooleanExtra("isFidoFlow", false), false, null);
            ddod ddodVar = new ddod(this, new ddoq());
            this.k = ddodVar;
            ddodVar.b(1, 1, a);
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        this.i.send(2002, Bundle.EMPTY);
        this.j = null;
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        this.j = new ProxyResultReceiver(null, this);
        Bundle bundle = new Bundle();
        bundle.putParcelable("resultReceiver", this.j);
        this.i.send(2001, bundle);
    }

    @Override // defpackage.degp
    public final void p(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accountChallengeData", arrayList);
        this.i.send(2003, bundle);
        finishAndRemoveTask();
    }

    @Override // defpackage.ddqr
    public final void y(int i, Bundle bundle) {
        if (i != 2051) {
            throw new RuntimeException(a.j(i, "Unknown event code: "));
        }
        finishAndRemoveTask();
    }

    @Override // defpackage.degp
    public final void x(String str) {
    }
}
