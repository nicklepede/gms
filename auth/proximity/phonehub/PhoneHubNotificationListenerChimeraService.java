package com.google.android.gms.auth.proximity.phonehub;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.chimera.android.NotificationListenerService;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubNotificationListenerChimeraService;
import defpackage.aeqe;
import defpackage.aewe;
import defpackage.aexd;
import defpackage.aeyf;
import defpackage.aeyg;
import defpackage.aeyh;
import defpackage.aeyr;
import defpackage.aeyy;
import defpackage.auad;
import defpackage.aupz;
import defpackage.auub;
import defpackage.carl;
import defpackage.carm;
import defpackage.elja;
import defpackage.elqm;
import defpackage.eqgo;
import defpackage.fntv;
import defpackage.fnuf;
import defpackage.imh;
import defpackage.imi;
import defpackage.imx;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneHubNotificationListenerChimeraService extends NotificationListenerService {
    private static final auad c = new auad("ProximityAuth", "PhoneHubNotificationListenerChimeraService");
    public aeyf a;
    public boolean b;
    private final Map d = new HashMap();
    private final Set e = new HashSet();
    private final eqgo f;
    private final aeyh g;
    private aewe h;
    private final aeqe i;

    public PhoneHubNotificationListenerChimeraService() {
        this.f = aeyr.a() ? new aupz(1, 9) : new aupz(1, 10);
        this.g = new aeyh(this);
        this.i = new aeqe();
    }

    static final boolean f(StatusBarNotification statusBarNotification) {
        if ((statusBarNotification.getNotification().flags & 512) != 0) {
            c.d("isSupportedNotification(): notification is group summary", new Object[0]);
            return false;
        }
        if (fnuf.l() && fnuf.e().b.contains(statusBarNotification.getPackageName())) {
            c.d("isSupportedNotification(): notification is from app in deny list", new Object[0]);
            return false;
        }
        fntv.d();
        Notification.Action[] actionArr = statusBarNotification.getNotification().actions;
        if (actionArr != null) {
            for (Notification.Action action : actionArr) {
                if (aexd.b(action)) {
                    Bundle bundle = statusBarNotification.getNotification().extras;
                    return (TextUtils.isEmpty(bundle.getString("android.title")) && TextUtils.isEmpty(bundle.getString("android.text")) && bundle.getParcelable("android.picture") == null) ? false : true;
                }
            }
        }
        c.d("isSupportedNotification(): notification is not a messaging notification", new Object[0]);
        return false;
    }

    private static final boolean g(ParcelableRanking parcelableRanking) {
        boolean isSuspended;
        if (!auub.e()) {
            return false;
        }
        isSuspended = parcelableRanking.a().isSuspended();
        return isSuspended;
    }

    public final StatusBarNotification a(int i) {
        Map map = this.d;
        Integer valueOf = Integer.valueOf(i);
        StatusBarNotification statusBarNotification = (StatusBarNotification) map.get(valueOf);
        if (statusBarNotification == null) {
            c.m("getNotification(): Invalid notification id %d", valueOf);
        }
        return statusBarNotification;
    }

    public final List b() {
        return c(getActiveNotifications(), getCurrentRanking());
    }

    final List c(StatusBarNotification[] statusBarNotificationArr, NotificationListenerService.RankingMap rankingMap) {
        Map map = this.d;
        map.clear();
        Set set = this.e;
        set.clear();
        ArrayList arrayList = new ArrayList();
        if (statusBarNotificationArr != null) {
            for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
                if (f(statusBarNotification)) {
                    map.put(Integer.valueOf(aexd.a(statusBarNotification)), statusBarNotification);
                    if (!g(aeyh.b(rankingMap, statusBarNotification))) {
                        set.add(Integer.valueOf(aexd.a(statusBarNotification)));
                        arrayList.add(statusBarNotification);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void d(aeyf aeyfVar) {
        if (aeyr.a()) {
            throw new IllegalArgumentException();
        }
        if (fnuf.p() && aeyfVar != this.h && aeyfVar != null) {
            c.m("Unexpected setCallback when cross profile connector is enabled. callback=%s", aeyfVar);
        }
        this.a = aeyfVar;
    }

    public final StatusBarNotification[] e() {
        return super.getActiveNotifications();
    }

    @Override // com.google.android.chimera.android.NotificationListenerService
    public final StatusBarNotification[] getActiveNotifications() {
        if (!fnuf.a.lK().I()) {
            return this.g.a();
        }
        try {
            return this.g.a();
        } catch (RuntimeException e) {
            aeqe aeqeVar = this.i;
            aeqeVar.b("failed_to_get_active_notifications");
            aeqeVar.c();
            c.n("failed to get active notifications", e, new Object[0]);
            try {
                Object e2 = carm.e(android.service.notification.NotificationListenerService.class, "getActiveNotifications", super.getContainerNotificationListenerService(), carl.a(1));
                return e2 == null ? new StatusBarNotification[0] : (StatusBarNotification[]) e2;
            } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException e3) {
                aeqe aeqeVar2 = this.i;
                aeqeVar2.b("failed_to_get_trimmed_active_notifications");
                aeqeVar2.c();
                c.n("failed to get trimmed active notifications", e3, new Object[0]);
                return new StatusBarNotification[0];
            }
        }
    }

    @Override // com.google.android.chimera.android.NotificationListenerService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        c.h("Binding service.", new Object[0]);
        if (fnuf.C()) {
            return getPackageName().equals(intent.getStringExtra("com.google.android.gms.auth.proximity.phonehub.EXTRA_ORIGIN")) ? new aeyg(this) : super.onBind(intent);
        }
        return null;
    }

    @Override // com.google.android.chimera.android.NotificationListenerService, com.google.android.chimera.Service
    public final void onCreate() {
        c.h("Creating service.", new Object[0]);
        super.onCreate();
        if (aeyr.a()) {
            this.a = aeyy.c(getApplicationContext());
        } else if (fnuf.p()) {
            aewe c2 = aewe.c(this);
            this.h = c2;
            d(c2);
        }
    }

    @Override // com.google.android.chimera.android.NotificationListenerService, com.google.android.chimera.Service
    public final void onDestroy() {
        c.h("Destroying service.", new Object[0]);
        super.onDestroy();
        if (aeyr.a() || !fnuf.p() || this.h == null) {
            return;
        }
        this.h = null;
    }

    @Override // com.google.android.chimera.android.NotificationListenerService
    public final void onInterruptionFilterChanged(final int i) {
        if (this.a != null) {
            this.f.execute(new Runnable() { // from class: aeya
                @Override // java.lang.Runnable
                public final void run() {
                    PhoneHubNotificationListenerChimeraService.this.a.d(i);
                }
            });
        }
    }

    @Override // com.google.android.chimera.android.NotificationListenerService
    public final void onListenerConnected() {
        c.h("onListenerConnected(): listener connected. User %s", Integer.valueOf(Process.myUserHandle().getIdentifier()));
        this.b = true;
        try {
            c(getActiveNotifications(), getCurrentRanking());
            if (this.a != null) {
                this.f.execute(new Runnable() { // from class: aexz
                    @Override // java.lang.Runnable
                    public final void run() {
                        PhoneHubNotificationListenerChimeraService.this.a.e();
                    }
                });
            }
        } catch (NullPointerException | SecurityException e) {
            c.n("Could not retrieve active notifications", e, new Object[0]);
        }
    }

    @Override // com.google.android.chimera.android.NotificationListenerService
    public final void onListenerDisconnected() {
        c.h("onListenerDisconnected(): listener disconnected. User %s", Integer.valueOf(Process.myUserHandle().getIdentifier()));
    }

    @Override // com.google.android.chimera.android.NotificationListenerService
    public final void onNotificationPosted(final StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        Uri uri;
        imx imxVar;
        auad auadVar = c;
        auadVar.d("XPF-notification is received notif=%s, notifUser=%s, user=%s", statusBarNotification.getKey(), Integer.valueOf(statusBarNotification.getUser().getIdentifier()), Integer.valueOf(Process.myUserHandle().getIdentifier()));
        if (f(statusBarNotification)) {
            if (fnuf.a.lK().Z()) {
                StatusBarNotification statusBarNotification2 = (StatusBarNotification) this.d.get(Integer.valueOf(aexd.a(statusBarNotification)));
                if (statusBarNotification2 == null) {
                    auadVar.d("isNotificationNewOrUpdated(): notification does not already exist (new notification).", new Object[0]);
                } else if (TextUtils.equals(statusBarNotification2.getPackageName(), statusBarNotification.getPackageName())) {
                    Notification notification = statusBarNotification2.getNotification();
                    Notification notification2 = statusBarNotification.getNotification();
                    if (notification == null || notification2 == null) {
                        return;
                    }
                    Bundle bundle = notification.extras;
                    Bundle bundle2 = notification2.extras;
                    if (bundle == null || bundle2 == null || (TextUtils.equals(bundle.getString("android.title"), bundle2.getString("android.title")) && TextUtils.equals(bundle.getString("android.text"), bundle2.getString("android.text")))) {
                        imi h = imi.h(notification);
                        imi h2 = imi.h(notification2);
                        if (h == null || h2 == null) {
                            return;
                        }
                        List list = h2.a;
                        List list2 = h.a;
                        if (list2.size() == list.size()) {
                            if (list2.isEmpty()) {
                                return;
                            }
                            imh imhVar = (imh) elja.p(list2);
                            imh imhVar2 = (imh) elja.p(list);
                            imx imxVar2 = imhVar.b;
                            boolean z = (imxVar2 != null && imhVar2.b == null) || (imxVar2 == null && imhVar2.b != null);
                            boolean z2 = (imxVar2 == null || (imxVar = imhVar2.b) == null || TextUtils.equals(imxVar2.a, imxVar.a)) ? false : true;
                            if (!z && !z2 && TextUtils.equals(imhVar.a, imhVar2.a)) {
                                Uri uri2 = imhVar.d;
                                boolean z3 = (uri2 != null && imhVar2.d == null) || (uri2 == null && imhVar2.d != null);
                                boolean z4 = (uri2 == null || (uri = imhVar2.d) == null || uri2.equals(uri)) ? false : true;
                                if (!z3 && !z4) {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    auadVar.d("isNotificationNewOrUpdated(): notification matches existing package.", new Object[0]);
                }
            }
            this.d.put(Integer.valueOf(aexd.a(statusBarNotification)), statusBarNotification);
            if (this.a == null) {
                auadVar.m("No callback listening for notification posted", new Object[0]);
                return;
            }
            final ParcelableRanking parcelableRanking = new ParcelableRanking(rankingMap, statusBarNotification.getKey());
            if (g(parcelableRanking)) {
                return;
            }
            this.f.execute(new Runnable() { // from class: aeyb
                @Override // java.lang.Runnable
                public final void run() {
                    PhoneHubNotificationListenerChimeraService.this.a.i(statusBarNotification, parcelableRanking);
                }
            });
        }
    }

    @Override // com.google.android.chimera.android.NotificationListenerService
    public final void onNotificationRankingUpdate(NotificationListenerService.RankingMap rankingMap) {
        if (this.a == null) {
            c.m("onNotificationRankingUpdate(): callback is null", new Object[0]);
            return;
        }
        HashSet<Integer> h = elqm.h(this.e);
        List<StatusBarNotification> c2 = c(getActiveNotifications(), rankingMap);
        HashSet hashSet = new HashSet();
        for (final StatusBarNotification statusBarNotification : c2) {
            Integer valueOf = Integer.valueOf(aexd.a(statusBarNotification));
            hashSet.add(valueOf);
            if (!h.contains(valueOf)) {
                final ParcelableRanking b = aeyh.b(rankingMap, statusBarNotification);
                this.f.execute(new Runnable() { // from class: aexx
                    @Override // java.lang.Runnable
                    public final void run() {
                        PhoneHubNotificationListenerChimeraService.this.a.i(statusBarNotification, b);
                    }
                });
            }
        }
        for (final Integer num : h) {
            if (!hashSet.contains(num)) {
                final StatusBarNotification a = a(num.intValue());
                this.f.execute(new Runnable() { // from class: aexy
                    @Override // java.lang.Runnable
                    public final void run() {
                        PhoneHubNotificationListenerChimeraService.this.a.j(num.intValue(), a);
                    }
                });
            }
        }
    }

    @Override // com.google.android.chimera.android.NotificationListenerService
    public final void onNotificationRemoved(final StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null) {
            c.m("onNotificationRemoved(): Removed notification is null.", new Object[0]);
            return;
        }
        Map map = this.d;
        final int a = aexd.a(statusBarNotification);
        Integer valueOf = Integer.valueOf(a);
        if (map.remove(valueOf) == null) {
            c.d("onNotificationRemoved(): Removed notification id %d", valueOf);
            this.e.remove(valueOf);
        } else if (this.a == null) {
            c.m("onNotificationRemoved(): No callback listening for notification removal", new Object[0]);
        } else {
            this.f.execute(new Runnable() { // from class: aeyc
                @Override // java.lang.Runnable
                public final void run() {
                    PhoneHubNotificationListenerChimeraService.this.a.j(a, statusBarNotification);
                }
            });
        }
    }

    @Override // com.google.android.chimera.android.NotificationListenerService, com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        c.h("Unbinding service.", new Object[0]);
        if ("android.service.notification.NotificationListenerService".equals(intent.getAction())) {
            this.b = false;
            this.d.clear();
            if (this.a != null) {
                this.f.execute(new Runnable() { // from class: aeyd
                    @Override // java.lang.Runnable
                    public final void run() {
                        PhoneHubNotificationListenerChimeraService.this.a.f();
                    }
                });
            }
        }
        return super.onUnbind(intent);
    }

    @Override // com.google.android.chimera.android.NotificationListenerService
    public final void onNotificationRemoved(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap, int i) {
        onNotificationRemoved(statusBarNotification);
    }
}
