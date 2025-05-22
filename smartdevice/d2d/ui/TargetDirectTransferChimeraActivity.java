package com.google.android.gms.smartdevice.d2d.ui;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import defpackage.a;
import defpackage.atmo;
import defpackage.atmr;
import defpackage.dfzi;
import defpackage.dfzv;
import defpackage.dg;
import defpackage.dgbw;
import defpackage.dgrr;
import defpackage.dgrs;
import defpackage.dgrt;
import defpackage.fmya;
import defpackage.ryb;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TargetDirectTransferChimeraActivity extends ryb implements dgrs, dgbw {
    public static final /* synthetic */ int h = 0;
    private ResultReceiver i;
    private ProxyResultReceiver j;
    private dfzi k;

    @Override // defpackage.dgrs
    public final void o(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("dependencyErrorCode", i);
        this.i.send(2005, bundle);
        finishAndRemoveTask();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        this.i.send(2004, Bundle.EMPTY);
        finishAndRemoveTask();
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dg g = gY().g(R.id.fragment_container);
        if (g instanceof dgrt) {
            ((dgrt) g).y();
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fmya.c()) {
            atmo.a(this);
        }
        atmr.g(this);
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
            Bundle a = dgrr.a(parcelableArrayListExtra, "", null, null, R.drawable.quantum_gm_ic_compare_arrows_vd_theme_24, true, getIntent().getBooleanExtra("isFidoFlow", false), false, null);
            dfzi dfziVar = new dfzi(this, new dfzv());
            this.k = dfziVar;
            dfziVar.b(1, 1, a);
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        this.i.send(2002, Bundle.EMPTY);
        this.j = null;
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        this.j = new ProxyResultReceiver(null, this);
        Bundle bundle = new Bundle();
        bundle.putParcelable("resultReceiver", this.j);
        this.i.send(2001, bundle);
    }

    @Override // defpackage.dgrs
    public final void p(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accountChallengeData", arrayList);
        this.i.send(2003, bundle);
        finishAndRemoveTask();
    }

    @Override // defpackage.dgbw
    public final void y(int i, Bundle bundle) {
        if (i != 2051) {
            throw new RuntimeException(a.j(i, "Unknown event code: "));
        }
        finishAndRemoveTask();
    }

    @Override // defpackage.dgrs
    public final void x(String str) {
    }
}
