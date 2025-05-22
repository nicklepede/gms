package com.google.android.gms.app.receiver;

import android.content.Context;
import android.content.Intent;
import android.content.RestrictionEntry;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.chimera.BroadcastReceiver;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GetRestrictionsChimeraReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        RestrictionEntry restrictionEntry = new RestrictionEntry("restricted_profile", "true");
        restrictionEntry.setType(0);
        restrictionEntry.setTitle("Restricted profile");
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(restrictionEntry);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("android.intent.extra.restrictions_list", arrayList);
        setResult(-1, null, bundle);
    }
}
