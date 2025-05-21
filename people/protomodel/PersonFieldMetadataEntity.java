package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cugl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PersonFieldMetadataEntity extends AbstractSafeParcelable implements PersonFieldMetadata {
    public static final Parcelable.Creator CREATOR = new cugl();
    public final Integer a;
    public final Boolean b;

    public PersonFieldMetadataEntity(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    @Override // com.google.android.gms.people.protomodel.PersonFieldMetadata
    public final Boolean a() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.PersonFieldMetadata
    public final Integer b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PersonFieldMetadata)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonFieldMetadata personFieldMetadata = (PersonFieldMetadata) obj;
        return arwb.b(b(), personFieldMetadata.b()) && arwb.b(a(), personFieldMetadata.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int a = arxc.a(parcel);
        arxc.F(parcel, 3, num);
        arxc.z(parcel, 4, this.b);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
