package com.google.android.gms.romanesco.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.czzl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RestoreSuggestionEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czzl();
    public final String a;
    public final String b;
    public final int c;
    public final Long d;
    public final boolean e;

    public RestoreSuggestionEntity(String str, String str2, int i, Long l, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = l;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RestoreSuggestionEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        RestoreSuggestionEntity restoreSuggestionEntity = (RestoreSuggestionEntity) obj;
        return atyq.b(restoreSuggestionEntity.a, this.a) && atyq.b(Integer.valueOf(restoreSuggestionEntity.c), Integer.valueOf(this.c)) && atyq.b(restoreSuggestionEntity.b, this.b) && atyq.b(restoreSuggestionEntity.d, this.d) && atyq.b(Boolean.valueOf(restoreSuggestionEntity.e), Boolean.valueOf(this.e));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.c), this.b, this.d, Boolean.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.o(parcel, 4, this.c);
        atzr.I(parcel, 5, this.d);
        atzr.e(parcel, 6, this.e);
        atzr.c(parcel, a);
    }
}
