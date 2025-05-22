package com.google.android.gms.smartdevice.d2d.ui;

import android.os.Bundle;
import defpackage.a;
import defpackage.dfzf;
import defpackage.dgrt;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SourceDirectTransferChimeraActivityV1 extends dfzf {
    public static final /* synthetic */ int y = 0;

    @Override // defpackage.dfzf
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

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.s);
        bundle.putBoolean("didUnlock", this.q);
    }

    @Override // defpackage.dgbw
    public final void y(int i, Bundle bundle) {
        switch (i) {
            case 1010:
                ArrayList arrayList = bundle == null ? new ArrayList() : bundle.getParcelableArrayList("extraAccountChallengeData");
                if (arrayList == null) {
                    throw new IllegalArgumentException("Accounts shouldn't be null in EVENT_CHALLENGE_SOURCE. ");
                }
                ((dgrt) this.n.a).z(arrayList, bundle.getString("extraRestoreAccount"));
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
