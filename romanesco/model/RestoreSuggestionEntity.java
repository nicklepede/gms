package com.google.android.gms.romanesco.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cxpo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RestoreSuggestionEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxpo();
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
        return arwb.b(restoreSuggestionEntity.a, this.a) && arwb.b(Integer.valueOf(restoreSuggestionEntity.c), Integer.valueOf(this.c)) && arwb.b(restoreSuggestionEntity.b, this.b) && arwb.b(restoreSuggestionEntity.d, this.d) && arwb.b(Boolean.valueOf(restoreSuggestionEntity.e), Boolean.valueOf(this.e));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.c), this.b, this.d, Boolean.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.o(parcel, 4, this.c);
        arxc.I(parcel, 5, this.d);
        arxc.e(parcel, 6, this.e);
        arxc.c(parcel, a);
    }
}
