package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cugf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class BirthdayEntity extends AbstractSafeParcelable implements Birthday {
    public static final Parcelable.Creator CREATOR = new cugf();
    public final PersonFieldMetadataEntity a;
    public final Long b;

    public BirthdayEntity(PersonFieldMetadata personFieldMetadata, Long l) {
        this.b = l;
        this.a = (PersonFieldMetadataEntity) personFieldMetadata;
    }

    @Override // com.google.android.gms.people.protomodel.Birthday
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Birthday
    public final Long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Birthday)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Birthday birthday = (Birthday) obj;
        return arwb.b(a(), birthday.a()) && arwb.b(b(), birthday.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, personFieldMetadataEntity, i, false);
        arxc.I(parcel, 3, this.b);
        arxc.c(parcel, a);
    }

    public BirthdayEntity(PersonFieldMetadataEntity personFieldMetadataEntity, Long l) {
        this.a = personFieldMetadataEntity;
        this.b = l;
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
