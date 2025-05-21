package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.aqxo;
import defpackage.bajh;
import defpackage.bp;
import defpackage.ccxq;
import defpackage.ccze;
import defpackage.fruc;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class QrlSettingsChimeraActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ccxq.f(this)) {
            finish();
            return;
        }
        setTitle(getString(R.string.fmd_quick_remote_lock_activity_title));
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.t(R.id.content_frame, new ccze());
            bpVar.d();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (!fruc.h()) {
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(R.menu.feedback_menu, menu);
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.feedback_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        aqxo aqxoVar = new aqxo((Context) getContainerActivity(), (int[][]) null);
        bajh bajhVar = new bajh(this);
        bajhVar.a = aqxo.Y(getContainerActivity());
        String e = fruc.e();
        if (!e.isEmpty()) {
            bajhVar.e = e;
        }
        aqxoVar.aa(bajhVar.a());
        return true;
    }
}
