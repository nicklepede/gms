package com.google.android.gms.location.settings;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.location.settings.LocationOffWarningChimeraActivity;
import defpackage.auub;
import defpackage.bwlt;
import defpackage.bzbx;
import defpackage.bzby;
import defpackage.ccvv;
import defpackage.edzp;
import defpackage.eluo;
import defpackage.ensy;
import defpackage.ensz;
import defpackage.eouj;
import defpackage.eouk;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fsos;
import defpackage.ip;
import defpackage.iq;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationOffWarningChimeraActivity extends ryt implements DialogInterface.OnClickListener {
    private iq j;
    private int k;
    private Boolean l;

    private final void a(boolean z) {
        if (this.l != null) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.l = valueOf;
        ((eluo) LocationOffWarningIntentOperation.a.h()).B("dialog choice was %b", valueOf);
        if (!isFinishing()) {
            finish();
        }
        if (z) {
            bzbx.d(this, this.k, bzby.a);
            ccvv.c().h(0L);
        }
        fgrc v = eouj.a.v();
        int i = true != z ? 4 : 3;
        if (!v.b.L()) {
            v.U();
        }
        eouj eoujVar = (eouj) v.b;
        eoujVar.c = i - 1;
        eoujVar.b |= 1;
        eouj eoujVar2 = (eouj) v.Q();
        fgrc v2 = ensz.a.v();
        ensy ensyVar = ensy.DIALOGS;
        if (!v2.b.L()) {
            v2.U();
        }
        ensz enszVar = (ensz) v2.b;
        enszVar.c = ensyVar.F;
        enszVar.b |= 1;
        fgrc v3 = eouk.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar = v3.b;
        eouk eoukVar = (eouk) fgriVar;
        eoukVar.c = 1;
        eoukVar.b = 1 | eoukVar.b;
        if (!fgriVar.L()) {
            v3.U();
        }
        eouk eoukVar2 = (eouk) v3.b;
        eoujVar2.getClass();
        eoukVar2.d = eoujVar2;
        eoukVar2.b |= 2;
        eouk eoukVar3 = (eouk) v3.Q();
        if (!v2.b.L()) {
            v2.U();
        }
        ensz enszVar2 = (ensz) v2.b;
        eoukVar3.getClass();
        enszVar2.j = eoukVar3;
        enszVar2.b |= 128;
        bwlt.v().f((ensz) v2.Q());
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        a(i == -1);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        ip edzpVar;
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
            ((eluo) ((eluo) LocationOffWarningIntentOperation.a.j()).s(e)).x("unable to close system dialogs");
        }
        if (auub.e()) {
            try {
                edzpVar = new edzp(this, true != fsos.c() ? 0 : R.style.Material3DialogTheme);
            } catch (IllegalArgumentException e2) {
                ((eluo) ((eluo) LocationOffWarningIntentOperation.a.j()).s(e2)).x("Failed to create MaterialAlertDialogBuilder");
            }
            edzpVar.l(R.string.location_off_dialog_title);
            edzpVar.o(R.string.location_off_dialog_message);
            edzpVar.setPositiveButton(R.string.location_off_dialog_button_turn_on_location, this);
            edzpVar.setNegativeButton(R.string.close_button_label, this);
            edzpVar.h(new DialogInterface.OnCancelListener() { // from class: ccut
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    LocationOffWarningChimeraActivity locationOffWarningChimeraActivity = LocationOffWarningChimeraActivity.this;
                    if (locationOffWarningChimeraActivity.isFinishing()) {
                        return;
                    }
                    locationOffWarningChimeraActivity.finish();
                }
            });
            iq create = edzpVar.create();
            this.j = create;
            create.setCanceledOnTouchOutside(false);
            this.j.show();
        }
        edzpVar = new ip(this);
        edzpVar.l(R.string.location_off_dialog_title);
        edzpVar.o(R.string.location_off_dialog_message);
        edzpVar.setPositiveButton(R.string.location_off_dialog_button_turn_on_location, this);
        edzpVar.setNegativeButton(R.string.close_button_label, this);
        edzpVar.h(new DialogInterface.OnCancelListener() { // from class: ccut
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                LocationOffWarningChimeraActivity locationOffWarningChimeraActivity = LocationOffWarningChimeraActivity.this;
                if (locationOffWarningChimeraActivity.isFinishing()) {
                    return;
                }
                locationOffWarningChimeraActivity.finish();
            }
        });
        iq create2 = edzpVar.create();
        this.j = create2;
        create2.setCanceledOnTouchOutside(false);
        this.j.show();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        if (!isChangingConfigurations()) {
            a(false);
        }
        super.onPause();
    }
}
