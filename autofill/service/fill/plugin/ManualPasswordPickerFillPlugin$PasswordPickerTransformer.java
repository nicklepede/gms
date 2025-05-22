package com.google.android.gms.autofill.service.fill.plugin;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.data.DataIntent$ResultTransformer;
import defpackage.afsw;
import defpackage.aftc;
import defpackage.aftf;
import defpackage.aftz;
import defpackage.aica;
import defpackage.aicb;
import defpackage.ekvi;
import defpackage.ekvk;
import defpackage.elqn;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ManualPasswordPickerFillPlugin$PasswordPickerTransformer implements DataIntent$ResultTransformer {
    public static final Parcelable.Creator CREATOR = new aica();
    private final aftc a;

    public ManualPasswordPickerFillPlugin$PasswordPickerTransformer(aftc aftcVar) {
        this.a = aftcVar;
    }

    @Override // com.google.android.gms.autofill.data.DataIntent$ResultTransformer
    public final Object a(int i, Intent intent, ekvi ekviVar) {
        if (i != -1) {
            return null;
        }
        String b = ekvk.b(intent.getStringExtra("pwm.DataFieldNames.pickerUsername"));
        String b2 = ekvk.b(intent.getStringExtra("pwm.DataFieldNames.pickerPassword"));
        if (b.isEmpty() && b2.isEmpty()) {
            ((eluo) ((eluo) aicb.a.j()).ai((char) 1240)).x("Empty username and password returned when picking password.");
            return null;
        }
        aftz aftzVar = new aftz(b2);
        aftc aftcVar = this.a;
        afsw afswVar = new afsw(b, aftzVar, aftcVar);
        afswVar.c = new elqn(aftcVar);
        afswVar.d = false;
        afswVar.e = false;
        return afswVar.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aftf.c(this.a, parcel);
    }
}
