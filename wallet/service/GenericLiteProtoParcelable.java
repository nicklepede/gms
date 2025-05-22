package com.google.android.gms.wallet.service;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ehqn;
import defpackage.fgsz;
import defpackage.fgtg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public abstract class GenericLiteProtoParcelable implements Parcelable {
    public final Account a;
    public fgsz b;
    public List c;
    private final fgtg d;
    private byte[] e;

    public GenericLiteProtoParcelable(Account account, fgtg fgtgVar, fgsz fgszVar) {
        this(account, fgtgVar, fgszVar, (List) null);
    }

    public final fgsz a() {
        if (this.b == null) {
            this.b = ehqn.c(this.e, this.d);
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

    public GenericLiteProtoParcelable(Account account, fgtg fgtgVar, fgsz fgszVar, List list) {
        this.a = account;
        this.d = fgtgVar;
        this.b = fgszVar;
        if (list != null) {
            this.c = new ArrayList(list);
        }
    }

    public GenericLiteProtoParcelable(Account account, fgtg fgtgVar, byte[] bArr) {
        this(account, fgtgVar, bArr, (List) null);
    }

    public GenericLiteProtoParcelable(Account account, fgtg fgtgVar, byte[] bArr, List list) {
        this.a = account;
        this.d = fgtgVar;
        this.e = (byte[]) bArr.clone();
        if (list != null) {
            this.c = new ArrayList(list);
        }
    }
}
