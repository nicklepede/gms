package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.czzs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class EmailAddressEntity extends AbstractSafeParcelable implements EmailAddress {
    public static final Parcelable.Creator CREATOR = new czzs();
    public final String a;

    public EmailAddressEntity(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.romanesco.protomodel.EmailAddress
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EmailAddress)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return atyq.b(a(), ((EmailAddress) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.c(parcel, a);
    }

    public EmailAddressEntity(EmailAddress emailAddress) {
        this(((EmailAddressEntity) emailAddress).a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
