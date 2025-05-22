package com.google.android.gms.payse;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.cvrm;
import java.math.BigDecimal;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SecureElementStoredValue extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cvrm();
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
        atyp.b("id", this.a, arrayList);
        atyp.b("serviceProvider", Integer.valueOf(this.b), arrayList);
        atyp.b("cardId", this.c, arrayList);
        atyp.b("balance", this.d, arrayList);
        int i = this.f;
        atyp.b("state", i != 0 ? i != 1 ? i != 2 ? "CARD_STATE_UNKNOWN" : "STORED_VALUE_CARD_STATE_NEEDS_FIX" : "STORED_VALUE_CARD_STATE_ACTIVE" : "STORED_VALUE_CARD_STATE_ABSENT", arrayList);
        atyp.b("nonce", this.g, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cvrm.a(this, parcel);
    }
}
