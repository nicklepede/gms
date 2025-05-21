package com.google.android.gms.smartdevice.d2d.ui;

import android.app.PendingIntent;
import android.content.res.Configuration;
import android.os.Bundle;
import defpackage.a;
import defpackage.ddoa;
import defpackage.ddod;
import defpackage.degq;
import defpackage.deji;
import defpackage.denq;
import defpackage.dg;
import defpackage.fsdd;
import defpackage.fsds;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SourceDirectTransferChimeraActivityV2 extends ddoa {
    public static final /* synthetic */ int y = 0;
    private static final denq z = new denq(new String[]{"SourceDirectTransferActivityV2"});

    @Override // defpackage.ddoa
    public final void G(Bundle bundle) {
        int i = 3;
        if (!this.w && (!fsds.e() || !this.o)) {
            i = this.u ? 8 : j();
        }
        denq denqVar = z;
        denqVar.d("startFragment firstState: %d", Integer.valueOf(i));
        if (bundle == null) {
            this.s = i;
            this.n.a(i, 1);
        } else {
            int i2 = bundle.getInt("state", i);
            this.s = i2;
            denqVar.d("savedInstanceState not null, startFragment state: %d", Integer.valueOf(i2));
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        ddod ddodVar;
        denq denqVar = z;
        denqVar.d("onConfigurationChanged()", new Object[0]);
        super.onConfigurationChanged(configuration);
        if (!fsdd.a.a().j() || (ddodVar = this.n) == null) {
            return;
        }
        dg dgVar = ddodVar.a;
        if (dgVar instanceof degq) {
            denqVar.d("AccountChallengeFragment is visible - reloading", new Object[0]);
            ((degq) dgVar).y();
        } else if (dgVar instanceof deji) {
            denqVar.d("LockScreenFragment is visible - do nothing", new Object[0]);
        } else {
            ddodVar.a(this.s, 4);
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        z.d("onSaveInstanceState state: %d", Integer.valueOf(this.s));
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.s);
    }

    @Override // defpackage.ddqr
    public final void y(int i, Bundle bundle) {
        denq denqVar = z;
        denqVar.d(a.j(i, "receive result: "), new Object[0]);
        if (i == 1021) {
            this.i = (PendingIntent) bundle.getParcelable("pendingIntent");
            denqVar.d("Received own PendingIntent", new Object[0]);
            return;
        }
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
