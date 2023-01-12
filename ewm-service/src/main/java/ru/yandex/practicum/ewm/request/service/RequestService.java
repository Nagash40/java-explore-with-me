package ru.yandex.practicum.ewm.request.service;

import ru.yandex.practicum.ewm.request.dto.ParticipationRequestDto;

import java.util.Collection;

public interface RequestService {

    ParticipationRequestDto addRequest(long userId, long eventId);

    Collection<ParticipationRequestDto> getRequestsByUser(long userId);

    Collection<ParticipationRequestDto> getRequestsByEventOwner(long ownerId, long eventId);

    int getConfirmedRequestsCount(long eventId);

    ParticipationRequestDto cancelRequest(long userId, long requestId);

    ParticipationRequestDto confirmRequestInOwnerEvent(long ownerId, long eventId, long requestId);

    ParticipationRequestDto rejectRequestInOwnerEvent(long ownerId, long eventId, long requestId);
}
