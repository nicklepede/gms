package com.google.android.gms.update.reminder;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.dher;
import defpackage.dhez;
import defpackage.dhfb;
import defpackage.dhfe;
import defpackage.dhgn;
import defpackage.dhik;
import defpackage.dhjt;
import defpackage.dhop;
import defpackage.eiif;
import defpackage.fibo;
import defpackage.fqrw;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UpdateReminderDialogIntentOperation extends IntentOperation {
    private static final arxo a = dhjt.d("UpdateReminderDialogControl");
    private static final dhop b = new dhop("control.popupdialog.last_aggresive_dialog_displayed_at", 0L);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a() {
        /*
            Method dump skipped, instructions count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.update.reminder.UpdateReminderDialogIntentOperation.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0141, code lost:
    
        if (r1 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0155, code lost:
    
        com.google.android.gms.update.reminder.UpdateReminderDialogIntentOperation.a.h("Not showing update reminder dialog over foreground package: %s", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0160, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0144, code lost:
    
        if (r1 == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void b() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.update.reminder.UpdateReminderDialogIntentOperation.b():void");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!dhfe.b(this)) {
            a.h("System update management not enabled in this context. Ignoring intent: %s", intent);
            return;
        }
        String b2 = eiif.b(intent.getAction());
        arxo arxoVar = a;
        arxoVar.j("Received action: %s", b2);
        if ("android.intent.action.ACTION_POWER_CONNECTED".equals(b2)) {
            if (((Boolean) dhez.a(fqrw.e, Boolean.class)).booleanValue()) {
                a();
                return;
            }
            return;
        }
        if ("android.intent.action.USER_PRESENT".equals(b2)) {
            if (eiif.c(dher.d())) {
                return;
            }
            a();
            return;
        }
        if ("com.google.android.gms.update.SCREEN_ON".equals(b2)) {
            if (dhgn.c()) {
                arxoVar.h("Received action: %s", b2);
            }
            b();
        } else if (Objects.equals(b2, "android.intent.action.BOOT_COMPLETED")) {
            if (dhgn.c()) {
                arxoVar.h("Received action: %s", b2);
            }
            if (dhgn.c()) {
                fibo c = dhik.c();
                if (c.equals(fibo.a) || !dhfb.h(c)) {
                    b();
                }
            }
        }
    }
}
