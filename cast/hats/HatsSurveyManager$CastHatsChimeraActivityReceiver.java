package com.google.android.gms.cast.hats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.libraries.surveys.SurveyMetadata;
import defpackage.aoyj;
import defpackage.aoyk;
import defpackage.appp;
import defpackage.atzb;
import defpackage.eabm;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class HatsSurveyManager$CastHatsChimeraActivityReceiver extends TracingBroadcastReceiver {
    public boolean a;
    public final /* synthetic */ aoyk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatsSurveyManager$CastHatsChimeraActivityReceiver(aoyk aoykVar) {
        super("cast");
        this.b = aoykVar;
        this.a = false;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_RESULT", -1);
        appp apppVar = aoyk.a;
        apppVar.n("Received HaTS survey event: %d", Integer.valueOf(intExtra));
        if (intExtra == 0) {
            final aoyk aoykVar = this.b;
            final SurveyMetadata surveyMetadata = (SurveyMetadata) intent.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
            apppVar.m("onSurveyPrompted");
            aoykVar.n = aoyj.PRESENTED;
            aoykVar.k = surveyMetadata != null ? surveyMetadata : aoykVar.k;
            aoykVar.m.ifPresent(new Consumer() { // from class: aoye
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    aoyk.this.k(surveyMetadata, (aoho) obj, 0, true);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (intExtra == 1) {
            final aoyk aoykVar2 = this.b;
            final SurveyMetadata surveyMetadata2 = (SurveyMetadata) intent.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
            apppVar.m("onSurveyClosed");
            aoykVar2.n = aoyj.NOT_PRESENTED;
            aoykVar2.k = surveyMetadata2 != null ? surveyMetadata2 : aoykVar2.k;
            aoykVar2.m.ifPresent(new Consumer() { // from class: aoxv
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    String str;
                    aoho aohoVar = (aoho) obj;
                    fgrc v = epgr.a.v();
                    aoyk aoykVar3 = aoyk.this;
                    aohu aohuVar = aoykVar3.l;
                    atzb.s(aohuVar);
                    String b = aohuVar.b();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar = v.b;
                    epgr epgrVar = (epgr) fgriVar;
                    b.getClass();
                    epgrVar.b |= 2;
                    epgrVar.d = b;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    SurveyMetadata surveyMetadata3 = surveyMetadata2;
                    fgri fgriVar2 = v.b;
                    epgr epgrVar2 = (epgr) fgriVar2;
                    epgrVar2.g = 2;
                    epgrVar2.b |= 16;
                    if (surveyMetadata3 != null && (str = surveyMetadata3.c) != null) {
                        if (!fgriVar2.L()) {
                            v.U();
                        }
                        epgr epgrVar3 = (epgr) v.b;
                        epgrVar3.b |= 1;
                        epgrVar3.c = str;
                    }
                    epgr epgrVar4 = (epgr) v.Q();
                    CastDevice castDevice = aoykVar3.e;
                    aohu aohuVar2 = aoykVar3.l;
                    atzb.s(aohuVar2);
                    aohoVar.q(epgrVar4, castDevice, aohuVar2.a());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (intExtra == 2) {
            if (intent.hasExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_PRESENT_SURVEY_ERROR_TYPE")) {
                String stringExtra = intent.getStringExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_PRESENT_SURVEY_ERROR_TYPE");
                atzb.s(stringExtra);
                final eabm eabmVar = (eabm) Enum.valueOf(eabm.class, stringExtra);
                final aoyk aoykVar3 = this.b;
                final SurveyMetadata surveyMetadata3 = (SurveyMetadata) intent.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
                apppVar.m("onPresentSurveyFailed");
                aoykVar3.n = aoyj.NOT_PRESENTED;
                aoykVar3.k = surveyMetadata3 != null ? surveyMetadata3 : aoykVar3.k;
                aoykVar3.m.ifPresent(new Consumer() { // from class: aoyc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        String str;
                        aoho aohoVar = (aoho) obj;
                        fgrc v = epgr.a.v();
                        aoyk aoykVar4 = aoyk.this;
                        aohu aohuVar = aoykVar4.l;
                        atzb.s(aohuVar);
                        String b = aohuVar.b();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        epgr epgrVar = (epgr) fgriVar;
                        b.getClass();
                        int i = 2;
                        epgrVar.b |= 2;
                        epgrVar.d = b;
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        eabm eabmVar2 = eabmVar;
                        epgr epgrVar2 = (epgr) v.b;
                        epgrVar2.g = 4;
                        epgrVar2.b |= 16;
                        appn.b();
                        switch (eabmVar2) {
                            case CLIENT_ACTIVITY_WAS_DESTROYED:
                                break;
                            case CLIENT_ACTIVITY_WAS_FINISHING:
                                i = 3;
                                break;
                            case CLIENT_ACTIVITY_WAS_NULL:
                                i = 4;
                                break;
                            case INVALID_COMPLETION_STYLE:
                                i = 5;
                                break;
                            case INVALID_PROMPT_STYLE:
                                i = 6;
                                break;
                            case INVALID_SURVEY_DATA_TYPE:
                                i = 7;
                                break;
                            case INVALID_SURVEY_PAYLOAD:
                                i = 8;
                                break;
                            case SURVEY_ALREADY_RUNNING:
                                i = 9;
                                break;
                            case SURVEY_EXPIRED:
                                i = 10;
                                break;
                            case UNSUPPORTED_EMBEDDED_SURVEY_CONTAINER:
                                i = 11;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                        if (!v.b.L()) {
                            v.U();
                        }
                        SurveyMetadata surveyMetadata4 = surveyMetadata3;
                        fgri fgriVar2 = v.b;
                        epgr epgrVar3 = (epgr) fgriVar2;
                        epgrVar3.h = i - 1;
                        epgrVar3.b |= 32;
                        if (surveyMetadata4 != null && (str = surveyMetadata4.c) != null) {
                            if (!fgriVar2.L()) {
                                v.U();
                            }
                            epgr epgrVar4 = (epgr) v.b;
                            epgrVar4.b = 1 | epgrVar4.b;
                            epgrVar4.c = str;
                        }
                        epgr epgrVar5 = (epgr) v.Q();
                        CastDevice castDevice = aoykVar4.e;
                        aohu aohuVar2 = aoykVar4.l;
                        atzb.s(aohuVar2);
                        aohoVar.n(epgrVar5, castDevice, aohuVar2.a());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
            return;
        }
        if (intExtra == 3) {
            final aoyk aoykVar4 = this.b;
            final SurveyMetadata surveyMetadata4 = (SurveyMetadata) intent.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
            apppVar.m("didAnswerSingleSelectQuestion");
            aoykVar4.n = aoyj.PRESENTED;
            aoykVar4.k = surveyMetadata4 != null ? surveyMetadata4 : aoykVar4.k;
            aoykVar4.m.ifPresent(new Consumer() { // from class: aoxw
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    aoyk.this.k(surveyMetadata4, (aoho) obj, 2, false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (intExtra == 4) {
            final aoyk aoykVar5 = this.b;
            final SurveyMetadata surveyMetadata5 = (SurveyMetadata) intent.getParcelableExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_SURVEY_METADATA");
            apppVar.m("didAnswerOpenTextQuestion");
            aoykVar5.n = aoyj.PRESENTED;
            aoykVar5.k = surveyMetadata5 != null ? surveyMetadata5 : aoykVar5.k;
            aoykVar5.m.ifPresent(new Consumer() { // from class: aoxy
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    aoyk.this.k(surveyMetadata5, (aoho) obj, 3, false);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (intExtra != 5) {
            apppVar.m("Received unknown HaTS survey event!");
            return;
        }
        final aoyk aoykVar6 = this.b;
        int intExtra2 = intent.getIntExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_REQUEST_CODE", -999);
        final int intExtra3 = intent.getIntExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_RESULT_CODE", -999);
        apppVar.p("onActivityResult(): requestCode=%d, resultCode=%d", Integer.valueOf(intExtra2), Integer.valueOf(intExtra3));
        aoykVar6.n = aoyj.NOT_PRESENTED;
        aoykVar6.m.ifPresent(new Consumer() { // from class: aoyf
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                String str;
                aoho aohoVar = (aoho) obj;
                fgrc v = epgr.a.v();
                aoyk aoykVar7 = aoyk.this;
                aohu aohuVar = aoykVar7.l;
                atzb.s(aohuVar);
                String b = aohuVar.b();
                if (!v.b.L()) {
                    v.U();
                }
                int i = intExtra3;
                fgri fgriVar = v.b;
                epgr epgrVar = (epgr) fgriVar;
                b.getClass();
                epgrVar.b |= 2;
                epgrVar.d = b;
                int i2 = i != -1 ? 4 : 2;
                if (!fgriVar.L()) {
                    v.U();
                }
                fgri fgriVar2 = v.b;
                epgr epgrVar2 = (epgr) fgriVar2;
                epgrVar2.g = i2 - 1;
                epgrVar2.b |= 16;
                SurveyMetadata surveyMetadata6 = aoykVar7.k;
                if (surveyMetadata6 != null && (str = surveyMetadata6.c) != null) {
                    if (!fgriVar2.L()) {
                        v.U();
                    }
                    epgr epgrVar3 = (epgr) v.b;
                    epgrVar3.b |= 1;
                    epgrVar3.c = str;
                }
                epgr epgrVar4 = (epgr) v.Q();
                CastDevice castDevice = aoykVar7.e;
                aohu aohuVar2 = aoykVar7.l;
                atzb.s(aohuVar2);
                aohoVar.q(epgrVar4, castDevice, aohuVar2.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (this.a) {
            aoykVar6.b.unregisterReceiver(this);
            this.a = false;
        }
    }
}
