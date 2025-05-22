package com.google.android.gms.smartdevice.d2d.ui;

import android.app.PendingIntent;
import android.content.res.Configuration;
import android.os.Bundle;
import defpackage.a;
import defpackage.dfzf;
import defpackage.dfzi;
import defpackage.dg;
import defpackage.dgrt;
import defpackage.dgul;
import defpackage.dgyt;
import defpackage.fuya;
import defpackage.fuyp;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SourceDirectTransferChimeraActivityV2 extends dfzf {
    public static final /* synthetic */ int y = 0;
    private static final dgyt z = new dgyt(new String[]{"SourceDirectTransferActivityV2"});

    @Override // defpackage.dfzf
    public final void G(Bundle bundle) {
        int i = 3;
        if (!this.w && (!fuyp.e() || !this.o)) {
            i = this.u ? 8 : j();
        }
        dgyt dgytVar = z;
        dgytVar.d("startFragment firstState: %d", Integer.valueOf(i));
        if (bundle == null) {
            this.s = i;
            this.n.a(i, 1);
        } else {
            int i2 = bundle.getInt("state", i);
            this.s = i2;
            dgytVar.d("savedInstanceState not null, startFragment state: %d", Integer.valueOf(i2));
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        dfzi dfziVar;
        dgyt dgytVar = z;
        dgytVar.d("onConfigurationChanged()", new Object[0]);
        super.onConfigurationChanged(configuration);
        if (!fuya.a.lK().j() || (dfziVar = this.n) == null) {
            return;
        }
        dg dgVar = dfziVar.a;
        if (dgVar instanceof dgrt) {
            dgytVar.d("AccountChallengeFragment is visible - reloading", new Object[0]);
            ((dgrt) dgVar).y();
        } else if (dgVar instanceof dgul) {
            dgytVar.d("LockScreenFragment is visible - do nothing", new Object[0]);
        } else {
            dfziVar.a(this.s, 4);
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        z.d("onSaveInstanceState state: %d", Integer.valueOf(this.s));
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.s);
    }

    @Override // defpackage.dgbw
    public final void y(int i, Bundle bundle) {
        dgyt dgytVar = z;
        dgytVar.d(a.j(i, "receive result: "), new Object[0]);
        if (i == 1021) {
            this.i = (PendingIntent) bundle.getParcelable("pendingIntent");
            dgytVar.d("Received own PendingIntent", new Object[0]);
            return;
        }
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
