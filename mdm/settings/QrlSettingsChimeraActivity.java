package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.atad;
import defpackage.bcnd;
import defpackage.bp;
import defpackage.cfgo;
import defpackage.cfid;
import defpackage.fuow;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class QrlSettingsChimeraActivity extends rzk {
    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!cfgo.f(this)) {
            finish();
            return;
        }
        setTitle(getString(R.string.fmd_quick_remote_lock_activity_title));
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.t(R.id.content_frame, new cfid());
            bpVar.d();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (!fuow.g()) {
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(R.menu.feedback_menu, menu);
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.feedback_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        atad atadVar = new atad((Context) getContainerActivity(), (int[][]) null);
        bcnd bcndVar = new bcnd(this);
        bcndVar.a = atad.Y(getContainerActivity());
        String e = fuow.e();
        if (!e.isEmpty()) {
            bcndVar.e = e;
        }
        atadVar.aa(bcndVar.a());
        return true;
    }
}
