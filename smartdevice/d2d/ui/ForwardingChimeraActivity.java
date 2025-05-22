package com.google.android.gms.smartdevice.d2d.ui;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.google.android.gms.R;
import defpackage.dgyt;
import defpackage.eftg;
import defpackage.ryb;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ForwardingChimeraActivity extends ryb {
    public static final /* synthetic */ int h = 0;
    private static final dgyt i = new dgyt(new String[]{"ForwardingChimeraActivity"});
    private ResultReceiver j;
    private Queue k;
    private Intent l;

    public static ResultReceiver j(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void finish() {
        finishAndRemoveTask();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 2) {
            this.j.send(-1, null);
            finishAndRemoveTask();
            return;
        }
        Intent intent2 = (Intent) this.k.poll();
        if (intent2 == null) {
            this.j.send(i3, null);
            finishAndRemoveTask();
        } else {
            Intent intent3 = this.l;
            if (intent3 != null) {
                intent2.fillIn(intent3, 0);
            }
            startActivityForResult(intent2, 1);
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        ForwardingChimeraActivity forwardingChimeraActivity;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intent intent2 = new Intent();
        this.l = intent2;
        eftg.a(intent, intent2);
        setTheme(R.style.SmartDevice_TransparentTheme);
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
        if (resultReceiver == null) {
            i.m("No receiver", new Object[0]);
            finishAndRemoveTask();
            return;
        }
        this.j = resultReceiver;
        ArrayList parcelableArrayListExtra = bundle == null ? intent.getParcelableArrayListExtra("intents") : bundle.getParcelableArrayList("intents");
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pendingIntent");
        if (pendingIntent != null) {
            if (bundle != null) {
                return;
            }
            try {
                forwardingChimeraActivity = this;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                forwardingChimeraActivity = this;
            }
            try {
                forwardingChimeraActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 2, this.l, 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i.g("Failed sending intent", e, new Object[0]);
                forwardingChimeraActivity.j.send(2, null);
                finishAndRemoveTask();
                return;
            }
        }
        if (parcelableArrayListExtra == null) {
            i.m("No intents given", new Object[0]);
            finishAndRemoveTask();
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque(parcelableArrayListExtra);
        this.k = arrayDeque;
        if (bundle == null) {
            Intent intent3 = (Intent) arrayDeque.poll();
            if (intent3 == null) {
                i.m("No intents to forward", new Object[0]);
                finishAndRemoveTask();
            } else {
                Intent intent4 = this.l;
                if (intent4 != null) {
                    intent3.fillIn(intent4, 0);
                }
                startActivityForResult(intent3, 1);
            }
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Queue queue = this.k;
        if (queue != null) {
            bundle.putParcelableArrayList("intents", new ArrayList<>(queue));
        }
    }
}
