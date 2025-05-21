package com.google.android.gms.payse;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.ctig;
import java.math.BigDecimal;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SecureElementStoredValue extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ctig();
    public final String a;
    public final int b;
    public final String c;
    public final BigDecimal d;
    public final String e;
    public final int f;
    public final String g;

    public SecureElementStoredValue(String str, int i, String str2, BigDecimal bigDecimal, String str3, int i2, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = bigDecimal;
        this.e = str3;
        this.f = i2;
        this.g = str4;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("id", this.a, arrayList);
        arwa.b("serviceProvider", Integer.valueOf(this.b), arrayList);
        arwa.b("cardId", this.c, arrayList);
        arwa.b("balance", this.d, arrayList);
        int i = this.f;
        arwa.b("state", i != 0 ? i != 1 ? i != 2 ? "CARD_STATE_UNKNOWN" : "STORED_VALUE_CARD_STATE_NEEDS_FIX" : "STORED_VALUE_CARD_STATE_ACTIVE" : "STORED_VALUE_CARD_STATE_ABSENT", arrayList);
        arwa.b("nonce", this.g, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ctig.a(this, parcel);
    }
}
