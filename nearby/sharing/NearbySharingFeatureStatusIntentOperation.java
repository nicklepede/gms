package com.google.android.gms.nearby.sharing;

import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.internal.GetOptInStatusParams;
import com.google.android.gms.nearby.sharing.internal.GetVisibilityParams;
import defpackage.aqxo;
import defpackage.aqxt;
import defpackage.arco;
import defpackage.arcy;
import defpackage.asew;
import defpackage.bqup;
import defpackage.bqur;
import defpackage.bquw;
import defpackage.cewk;
import defpackage.cmuk;
import defpackage.cmun;
import defpackage.cmus;
import defpackage.eiid;
import defpackage.enss;
import defpackage.fqlm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NearbySharingFeatureStatusIntentOperation extends bquw {
    public NearbySharingFeatureStatusIntentOperation() {
        super(asew.NEARBY_SHARING);
    }

    @Override // defpackage.bquw
    public final bqup a(bqur bqurVar) {
        cmus a = cmuk.a(this, eiid.i(bqurVar.a));
        aqxt aqxtVar = a.b;
        arcy arcyVar = new arcy();
        arcyVar.a = new arco() { // from class: cmza
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                int i = cnad.a;
                cmwv cmwvVar = (cmwv) ((cnbx) obj).H();
                GetOptInStatusParams getOptInStatusParams = new GetOptInStatusParams();
                getOptInStatusParams.a = new cmzy((dfau) obj2);
                cmwvVar.r(getOptInStatusParams);
            }
        };
        Feature feature = cewk.a;
        arcyVar.c = new Feature[]{feature};
        arcyVar.d = 1348;
        aqxo aqxoVar = (aqxo) aqxtVar;
        enss a2 = a.a(aqxoVar.iO(arcyVar.a()));
        arcy arcyVar2 = new arcy();
        arcyVar2.a = new arco() { // from class: cmyz
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                int i = cnad.a;
                cmwv cmwvVar = (cmwv) ((cnbx) obj).H();
                GetVisibilityParams getVisibilityParams = new GetVisibilityParams();
                getVisibilityParams.a = new cnac((dfau) obj2);
                cmwvVar.u(getVisibilityParams);
            }
        };
        arcyVar2.c = new Feature[]{feature};
        arcyVar2.d = 1245;
        return new cmun(a2, a.a(aqxoVar.iO(arcyVar2.a())));
    }

    @Override // defpackage.bqtk
    protected final boolean b() {
        return fqlm.a.a().b();
    }
}
