package com.google.android.gms.smartdevice.d2d.ui;

import android.os.Bundle;
import defpackage.a;
import defpackage.ddoa;
import defpackage.degq;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SourceDirectTransferChimeraActivityV1 extends ddoa {
    public static final /* synthetic */ int y = 0;

    @Override // defpackage.ddoa
    public final void G(Bundle bundle) {
        int j = this.u ? 8 : j();
        if (bundle == null) {
            this.s = j;
            this.n.a(j, 1);
        } else {
            this.s = bundle.getInt("state", j);
            this.q = bundle.getBoolean("didUnlock");
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.s);
        bundle.putBoolean("didUnlock", this.q);
    }

    @Override // defpackage.ddqr
    public final void y(int i, Bundle bundle) {
        switch (i) {
            case 1010:
                ArrayList arrayList = bundle == null ? new ArrayList() : bundle.getParcelableArrayList("extraAccountChallengeData");
                if (arrayList == null) {
                    throw new IllegalArgumentException("Accounts shouldn't be null in EVENT_CHALLENGE_SOURCE. ");
                }
                ((degq) this.n.a).z(arrayList, bundle.getString("extraRestoreAccount"));
                return;
            case 1011:
            case 1012:
            case 1013:
                finishAndRemoveTask();
                return;
            default:
                throw new IllegalStateException(a.j(i, "Unknown ResultReceiver resultCode: "));
        }
    }
}
