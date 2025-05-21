package com.google.android.gms.wallet.service;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.efdk;
import defpackage.feeg;
import defpackage.feen;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public abstract class GenericLiteProtoParcelable implements Parcelable {
    public final Account a;
    public feeg b;
    public List c;
    private final feen d;
    private byte[] e;

    public GenericLiteProtoParcelable(Account account, feen feenVar, feeg feegVar) {
        this(account, feenVar, feegVar, (List) null);
    }

    public final feeg a() {
        if (this.b == null) {
            this.b = efdk.c(this.e, this.d);
        }
        return this.b;
    }

    public final byte[] b() {
        if (this.e == null) {
            this.e = this.b.r();
        }
        return (byte[]) this.e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, 0);
        parcel.writeByteArray(b());
        parcel.writeStringList(this.c);
    }

    public GenericLiteProtoParcelable(Account account, feen feenVar, feeg feegVar, List list) {
        this.a = account;
        this.d = feenVar;
        this.b = feegVar;
        if (list != null) {
            this.c = new ArrayList(list);
        }
    }

    public GenericLiteProtoParcelable(Account account, feen feenVar, byte[] bArr) {
        this(account, feenVar, bArr, (List) null);
    }

    public GenericLiteProtoParcelable(Account account, feen feenVar, byte[] bArr, List list) {
        this.a = account;
        this.d = feenVar;
        this.e = (byte[]) bArr.clone();
        if (list != null) {
            this.c = new ArrayList(list);
        }
    }
}
