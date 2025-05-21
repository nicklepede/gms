package com.google.android.gms.auth.proximity.phonehub;

import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.NotificationListenerService;
import defpackage.acxe;
import defpackage.arwm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ParcelableRanking implements Parcelable {
    public static final Parcelable.Creator CREATOR = new acxe();
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
        arwm.s(readString);
        this.b = readString;
    }
}
