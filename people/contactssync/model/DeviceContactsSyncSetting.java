package com.google.android.gms.people.contactssync.model;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctwk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class DeviceContactsSyncSetting extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctwk();
    public static final int NOT_APPLICABLE = 1;
    public static final int OFF = 2;
    public static final int ON = 3;
    public static final int UNKNOWN_SYNC_SETTING = 0;
    private final int a;
    private final Account b;

    public DeviceContactsSyncSetting(int i, Account account) {
        this.a = i;
        this.b = account;
    }

    public static DeviceContactsSyncSetting create(int i) {
        return new DeviceContactsSyncSetting(i, null);
    }

    public Account getAccount() {
        return this.b;
    }

    public int getSyncSetting() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, getSyncSetting());
        arxc.t(parcel, 2, getAccount(), i, false);
        arxc.c(parcel, a);
    }

    public static DeviceContactsSyncSetting create(int i, Account account) {
        return new DeviceContactsSyncSetting(i, account);
    }
}
