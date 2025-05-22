package com.google.android.gms.nearby.sharing;

import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.internal.GetOptInStatusParams;
import com.google.android.gms.nearby.sharing.internal.GetVisibilityParams;
import defpackage.atad;
import defpackage.atai;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.auiq;
import defpackage.btcg;
import defpackage.btci;
import defpackage.btcn;
import defpackage.chdv;
import defpackage.cpcs;
import defpackage.cpcv;
import defpackage.cpda;
import defpackage.ekvi;
import defpackage.eqgl;
import defpackage.ftfh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NearbySharingFeatureStatusIntentOperation extends btcn {
    public NearbySharingFeatureStatusIntentOperation() {
        super(auiq.NEARBY_SHARING);
    }

    @Override // defpackage.btcn
    public final btcg a(btci btciVar) {
        cpda a = cpcs.a(this, ekvi.i(btciVar.a));
        atai ataiVar = a.b;
        atfn atfnVar = new atfn();
        atfnVar.a = new atfd() { // from class: cphi
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                int i = cpil.a;
                cpfd cpfdVar = (cpfd) ((cpkf) obj).H();
                GetOptInStatusParams getOptInStatusParams = new GetOptInStatusParams();
                getOptInStatusParams.a = new cpig((dhma) obj2);
                cpfdVar.r(getOptInStatusParams);
            }
        };
        Feature feature = chdv.a;
        atfnVar.c = new Feature[]{feature};
        atfnVar.d = 1348;
        atad atadVar = (atad) ataiVar;
        eqgl a2 = a.a(atadVar.jd(atfnVar.a()));
        atfn atfnVar2 = new atfn();
        atfnVar2.a = new atfd() { // from class: cphh
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                int i = cpil.a;
                cpfd cpfdVar = (cpfd) ((cpkf) obj).H();
                GetVisibilityParams getVisibilityParams = new GetVisibilityParams();
                getVisibilityParams.a = new cpik((dhma) obj2);
                cpfdVar.u(getVisibilityParams);
            }
        };
        atfnVar2.c = new Feature[]{feature};
        atfnVar2.d = 1245;
        return new cpcv(a2, a.a(atadVar.jd(atfnVar2.a())));
    }

    @Override // defpackage.btbb
    protected final boolean b() {
        return ftfh.a.lK().b();
    }
}
