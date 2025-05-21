package com.google.android.gms.motionsicknessassist.settings;

import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.asot;
import defpackage.bp;
import defpackage.cetu;
import defpackage.ceuu;
import defpackage.ejhf;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MotionSicknessSettingsChimeraActivity extends qgg {
    public static final /* synthetic */ int j = 0;
    private static final asot k = cetu.a("Settings Activity");

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ejhf) ((ejhf) k.h()).ah((char) 6487)).x("onCreate()");
        setContentView(R.layout.motion_sickness_layout);
        setTitle(R.string.motion_sickness_settings_activity_label);
        ceuu ceuuVar = new ceuu();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.main_container, ceuuVar, "motion_sickness_preference");
        bpVar.a();
    }
}
