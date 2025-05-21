package com.google.android.gms.autofill.service.fill.plugin;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.data.DataIntent$ResultTransformer;
import defpackage.adsp;
import defpackage.adsv;
import defpackage.adsy;
import defpackage.adts;
import defpackage.agbl;
import defpackage.agbm;
import defpackage.eiid;
import defpackage.eiif;
import defpackage.ejdg;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ManualPasswordPickerFillPlugin$PasswordPickerTransformer implements DataIntent$ResultTransformer {
    public static final Parcelable.Creator CREATOR = new agbl();
    private final adsv a;

    public ManualPasswordPickerFillPlugin$PasswordPickerTransformer(adsv adsvVar) {
        this.a = adsvVar;
    }

    @Override // com.google.android.gms.autofill.data.DataIntent$ResultTransformer
    public final Object a(int i, Intent intent, eiid eiidVar) {
        if (i != -1) {
            return null;
        }
        String b = eiif.b(intent.getStringExtra("pwm.DataFieldNames.pickerUsername"));
        String b2 = eiif.b(intent.getStringExtra("pwm.DataFieldNames.pickerPassword"));
        if (b.isEmpty() && b2.isEmpty()) {
            ((ejhf) ((ejhf) agbm.a.j()).ah((char) 1236)).x("Empty username and password returned when picking password.");
            return null;
        }
        adts adtsVar = new adts(b2);
        adsv adsvVar = this.a;
        adsp adspVar = new adsp(b, adtsVar, adsvVar);
        adspVar.c = new ejdg(adsvVar);
        adspVar.d = false;
        adspVar.e = false;
        return adspVar.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        adsy.c(this.a, parcel);
    }
}
