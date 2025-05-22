package com.google.android.gms.auth.proximity.phonehub;

import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.NotificationListenerService;
import defpackage.aexe;
import defpackage.atzb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ParcelableRanking implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aexe();
    final NotificationListenerService.RankingMap a;
    final String b;

    public ParcelableRanking(NotificationListenerService.RankingMap rankingMap, String str) {
        this.a = rankingMap;
        this.b = str;
    }

    public final NotificationListenerService.Ranking a() {
        NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
        this.a.getRanking(this.b, ranking);
        return ranking;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
    }

    public ParcelableRanking(Parcel parcel) {
        this.a = (NotificationListenerService.RankingMap) NotificationListenerService.RankingMap.CREATOR.createFromParcel(parcel);
        String readString = parcel.readString();
        atzb.s(readString);
        this.b = readString;
    }
}
