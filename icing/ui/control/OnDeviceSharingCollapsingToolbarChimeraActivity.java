package com.google.android.gms.icing.ui.control;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import defpackage.blvq;
import defpackage.blvs;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class OnDeviceSharingCollapsingToolbarChimeraActivity extends qgg {
    public Context j;
    public MaterialProgressBar k;
    public TextView l;
    public TextView m;
    public final blvs n = new blvs(this);
    private View o;

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.personalize_using_shared_data_settings_title);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        this.j = this;
        setContentView(R.layout.on_device_sharing_activity);
        this.k = (MaterialProgressBar) findViewById(R.id.progress);
        TextView textView = (TextView) findViewById(R.id.empty);
        this.l = textView;
        textView.setText(R.string.personalize_using_shared_data_ui_empty);
        TextView textView2 = (TextView) findViewById(R.id.error);
        this.m = textView2;
        textView2.setText(R.string.on_device_sharing_ui_error);
        View findViewById = findViewById(android.R.id.list);
        this.o = findViewById;
        findViewById.setVisibility(8);
        new blvq(this).execute(new Void[0]);
    }
}
