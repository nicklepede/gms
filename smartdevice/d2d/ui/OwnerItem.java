package com.google.android.gms.smartdevice.d2d.ui;

import android.content.Context;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.owners.ParcelableDeviceOwner;
import com.google.android.gms.smartdevice.d2d.ui.accountpicker.AccountCard;
import com.google.android.setupdesign.items.Item;
import defpackage.efrl;
import defpackage.efwg;
import defpackage.efwn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OwnerItem extends Item {
    public final ParcelableDeviceOwner a;

    public OwnerItem(ParcelableDeviceOwner parcelableDeviceOwner) {
        this.a = parcelableDeviceOwner;
        e(parcelableDeviceOwner.f);
    }

    @Override // com.google.android.setupdesign.items.Item, defpackage.efub
    public final void b(View view) {
        AccountCard accountCard = (AccountCard) view;
        accountCard.a(this.a);
        accountCard.b();
        Context context = accountCard.getContext();
        int i = efwn.a;
        if (efrl.z(context)) {
            efwg.a(accountCard);
        }
    }

    @Override // com.google.android.setupdesign.items.Item, defpackage.efub
    public final int hf() {
        return R.layout.smartdevice_account_card;
    }

    public OwnerItem(ParcelableDeviceOwner parcelableDeviceOwner, byte[] bArr) {
        this.a = parcelableDeviceOwner;
        e(false);
    }
}
