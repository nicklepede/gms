package com.google.android.gms.location.settings;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.location.settings.LocationOffWarningChimeraActivity;
import defpackage.asqh;
import defpackage.budr;
import defpackage.bwth;
import defpackage.bwti;
import defpackage.canf;
import defpackage.ebna;
import defpackage.ejhf;
import defpackage.elfl;
import defpackage.elfm;
import defpackage.emgv;
import defpackage.emgw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fpva;
import defpackage.ip;
import defpackage.iq;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationOffWarningChimeraActivity extends qfp implements DialogInterface.OnClickListener {
    private iq j;
    private int k;
    private Boolean l;

    private final void a(boolean z) {
        if (this.l != null) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.l = valueOf;
        ((ejhf) LocationOffWarningIntentOperation.a.h()).B("dialog choice was %b", valueOf);
        if (!isFinishing()) {
            finish();
        }
        if (z) {
            bwth.d(this, this.k, bwti.a);
            canf.c().h(0L);
        }
        fecj v = emgv.a.v();
        int i = true != z ? 4 : 3;
        if (!v.b.L()) {
            v.U();
        }
        emgv emgvVar = (emgv) v.b;
        emgvVar.c = i - 1;
        emgvVar.b |= 1;
        emgv emgvVar2 = (emgv) v.Q();
        fecj v2 = elfm.a.v();
        elfl elflVar = elfl.DIALOGS;
        if (!v2.b.L()) {
            v2.U();
        }
        elfm elfmVar = (elfm) v2.b;
        elfmVar.c = elflVar.F;
        elfmVar.b |= 1;
        fecj v3 = emgw.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fecp fecpVar = v3.b;
        emgw emgwVar = (emgw) fecpVar;
        emgwVar.c = 1;
        emgwVar.b = 1 | emgwVar.b;
        if (!fecpVar.L()) {
            v3.U();
        }
        emgw emgwVar2 = (emgw) v3.b;
        emgvVar2.getClass();
        emgwVar2.d = emgvVar2;
        emgwVar2.b |= 2;
        emgw emgwVar3 = (emgw) v3.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        elfm elfmVar2 = (elfm) v2.b;
        emgwVar3.getClass();
        elfmVar2.j = emgwVar3;
        elfmVar2.b |= 128;
        budr.v().f((elfm) v2.Q());
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        a(i == -1);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        ip ebnaVar;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("previousMode", 0);
        this.k = intExtra;
        if (intExtra == 0) {
            int i = LocationOffWarningIntentOperation.b;
            finish();
            return;
        }
        int i2 = LocationOffWarningIntentOperation.b;
        try {
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (SecurityException e) {
            ((ejhf) ((ejhf) LocationOffWarningIntentOperation.a.j()).s(e)).x("unable to close system dialogs");
        }
        if (asqh.e()) {
            try {
                ebnaVar = new ebna(this, true != fpva.c() ? 0 : R.style.Material3DialogTheme);
            } catch (IllegalArgumentException e2) {
                ((ejhf) ((ejhf) LocationOffWarningIntentOperation.a.j()).s(e2)).x("Failed to create MaterialAlertDialogBuilder");
            }
            ebnaVar.j(R.string.location_off_dialog_title);
            ebnaVar.m(R.string.location_off_dialog_message);
            ip positiveButton = ebnaVar.setPositiveButton(R.string.location_off_dialog_button_turn_on_location, this);
            positiveButton.setNegativeButton(R.string.close_button_label, this);
            positiveButton.h(new DialogInterface.OnCancelListener() { // from class: camd
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    LocationOffWarningChimeraActivity locationOffWarningChimeraActivity = LocationOffWarningChimeraActivity.this;
                    if (locationOffWarningChimeraActivity.isFinishing()) {
                        return;
                    }
                    locationOffWarningChimeraActivity.finish();
                }
            });
            iq create = positiveButton.create();
            this.j = create;
            create.setCanceledOnTouchOutside(false);
            this.j.show();
        }
        ebnaVar = new ip(this);
        ebnaVar.j(R.string.location_off_dialog_title);
        ebnaVar.m(R.string.location_off_dialog_message);
        ip positiveButton2 = ebnaVar.setPositiveButton(R.string.location_off_dialog_button_turn_on_location, this);
        positiveButton2.setNegativeButton(R.string.close_button_label, this);
        positiveButton2.h(new DialogInterface.OnCancelListener() { // from class: camd
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                LocationOffWarningChimeraActivity locationOffWarningChimeraActivity = LocationOffWarningChimeraActivity.this;
                if (locationOffWarningChimeraActivity.isFinishing()) {
                    return;
                }
                locationOffWarningChimeraActivity.finish();
            }
        });
        iq create2 = positiveButton2.create();
        this.j = create2;
        create2.setCanceledOnTouchOutside(false);
        this.j.show();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        a(false);
        super.onPause();
    }
}
