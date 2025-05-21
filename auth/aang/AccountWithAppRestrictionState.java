package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.uox;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountWithAppRestrictionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uox();
    public final GoogleAccount a;
    public final AppRestrictionState b;

    public AccountWithAppRestrictionState(GoogleAccount googleAccount, AppRestrictionState appRestrictionState) {
        this.a = googleAccount;
        this.b = appRestrictionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountWithAppRestrictionState)) {
            return false;
        }
        AccountWithAppRestrictionState accountWithAppRestrictionState = (AccountWithAppRestrictionState) obj;
        return this.a.equals(accountWithAppRestrictionState.a) && this.b.equals(accountWithAppRestrictionState.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format("AccountWithAppRestrictionState{googleAccount=%s, appRestrictionState=%s}", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, googleAccount, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
